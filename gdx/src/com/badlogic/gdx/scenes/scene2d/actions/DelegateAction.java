package com.badlogic.gdx.scenes.scene2d.actions;

import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.utils.Pool;

/**
 * Base class for an action that wraps another action.
 */
abstract public class DelegateAction extends Action {
    protected Action action;

    public Action getAction() {
        return action;
    }

    /**
     * Sets the wrapped action.
     */
    public void setAction(Action action) {
        this.action = action;
    }

    abstract protected boolean delegate(float delta);

    public final boolean act(float delta) {
        Pool pool = getPool();
        setPool(null); // Ensure this action can't be returned to the pool inside the delegate action.
        try {
            return delegate(delta);
        } finally {
            setPool(pool);
        }
    }

    public void restart() {
        if (action != null) action.restart();
    }

    public void reset() {
        super.reset();
        action = null;
    }

    public void setActor(Actor actor) {
        if (action != null) action.setActor(actor);
        super.setActor(actor);
    }

    public void setTarget(Actor target) {
        if (action != null) action.setTarget(target);
        super.setTarget(target);
    }

    public String toString() {
        return super.toString() + (action == null ? "" : "(" + action + ")");
    }
}
