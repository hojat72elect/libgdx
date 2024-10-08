package com.badlogic.gdx.tests.g3d;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g3d.Material;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.graphics.g3d.attributes.BlendingAttribute;
import com.badlogic.gdx.graphics.g3d.model.Animation;
import com.badlogic.gdx.graphics.g3d.model.Node;
import com.badlogic.gdx.graphics.g3d.utils.AnimationController;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ObjectMap;
import com.badlogic.gdx.utils.Pool;
import com.badlogic.gdx.utils.StringBuilder;

public class SkeletonTest extends BaseG3dHudTest {
    private final static Vector3 tmpV = new Vector3();
    private final static Pool<Vector3> vectorPool = new Pool<Vector3>() {
        @Override
        protected Vector3 newObject() {
            return new Vector3();
        }
    };
    private final static Quaternion tmpQ = new Quaternion();
    protected String currentlyLoading;
    ShapeRenderer shapeRenderer;
    ObjectMap<ModelInstance, AnimationController> animationControllers = new ObjectMap<ModelInstance, AnimationController>();

    @Override
    public void create() {
        super.create();
        showAxes = false;
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setColor(Color.WHITE);
        onModelClicked("g3d/knight.g3db");
    }

    @Override
    protected void render(ModelBatch batch, Array<ModelInstance> instances) {
        for (ObjectMap.Entry<ModelInstance, AnimationController> e : animationControllers.entries())
            e.value.update(Gdx.graphics.getDeltaTime());
        for (final ModelInstance instance : instances)
            renderSkeleton(instance);
        batch.render(instances);
    }

    public void renderSkeleton(final ModelInstance instance) {
        shapeRenderer.setProjectionMatrix(cam.combined);
        shapeRenderer.begin(ShapeType.Line);
        for (Node node : instance.nodes) {
            shapeRenderer.setColor(node.isAnimated ? Color.RED : Color.YELLOW);
            node.globalTransform.getTranslation(tmpV);
            shapeRenderer.box(tmpV.x, tmpV.y, tmpV.z, 0.5f, 0.5f, 0.5f);
            for (Node child : node.getChildren())
                renderSkeleton(tmpV, child);
        }
        shapeRenderer.end();
    }

    public void renderSkeleton(final Vector3 from, final Node node) {
        final Vector3 pos = vectorPool.obtain();
        node.globalTransform.getTranslation(pos);
        shapeRenderer.setColor(node.isAnimated ? Color.RED : Color.YELLOW);
        shapeRenderer.box(pos.x, pos.y, pos.z, 0.5f, 0.5f, 0.5f);
        shapeRenderer.setColor(Color.WHITE);
        shapeRenderer.line(from.x, from.y, from.z, pos.x, pos.y, pos.z);
        for (Node child : node.getChildren())
            renderSkeleton(pos, child);
        vectorPool.free(pos);
    }

    @Override
    protected void getStatus(StringBuilder stringBuilder) {
        super.getStatus(stringBuilder);

        for (final ModelInstance instance : instances) {
            if (instance.animations.size > 0) {
                stringBuilder.append(" press space or menu to switch animation");
                break;
            }
        }
    }

    @Override
    protected void onModelClicked(final String name) {
        if (name == null) return;

        currentlyLoading = "data/" + name;
        assets.load(currentlyLoading, Model.class);
        loading = true;
    }

    @Override
    protected void onLoaded() {
        if (currentlyLoading == null || currentlyLoading.isEmpty()) return;

        instances.clear();
        animationControllers.clear();
        final ModelInstance instance = new ModelInstance(assets.get(currentlyLoading, Model.class));
        for (Material m : instance.materials)
            m.set(new BlendingAttribute(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA, 0.8f));
        instances.add(instance);
        if (instance.animations.size > 0) animationControllers.put(instance, new AnimationController(instance));
        currentlyLoading = null;
    }

    protected void switchAnimation() {
        for (ObjectMap.Entry<ModelInstance, AnimationController> e : animationControllers.entries()) {
            int animIndex = 0;
            if (e.value.current != null) {
                for (int i = 0; i < e.key.animations.size; i++) {
                    final Animation animation = e.key.animations.get(i);
                    if (e.value.current.animation == animation) {
                        animIndex = i;
                        break;
                    }
                }
            }
            animIndex = (animIndex + 1) % e.key.animations.size;
            e.value.animate(e.key.animations.get(animIndex).id, -1, 1f, null, 0.2f);
        }
    }

    @Override
    public boolean keyUp(int keycode) {
        if (keycode == Keys.SPACE || keycode == Keys.MENU) switchAnimation();
        return super.keyUp(keycode);
    }
}
