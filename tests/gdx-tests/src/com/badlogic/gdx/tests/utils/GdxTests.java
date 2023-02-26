package com.badlogic.gdx.tests.utils;


import com.badlogic.gdx.tests.bench.TiledMapBench;
import com.badlogic.gdx.tests.conformance.AudioSoundAndMusicIsolationTest;
import com.badlogic.gdx.tests.conformance.DisplayModeTest;
import com.badlogic.gdx.tests.examples.MoveSpriteExample;
import com.badlogic.gdx.tests.extensions.FreeTypeAtlasTest;
import com.badlogic.gdx.tests.extensions.FreeTypeDisposeTest;
import com.badlogic.gdx.tests.extensions.FreeTypeFontLoaderTest;
import com.badlogic.gdx.tests.extensions.FreeTypeIncrementalTest;
import com.badlogic.gdx.tests.extensions.FreeTypeMetricsTest;
import com.badlogic.gdx.tests.extensions.FreeTypePackTest;
import com.badlogic.gdx.tests.extensions.FreeTypeTest;
import com.badlogic.gdx.tests.extensions.InternationalFontsTest;
import com.badlogic.gdx.tests.g3d.Animation3DTest;
import com.badlogic.gdx.tests.g3d.AnisotropyTest;
import com.badlogic.gdx.tests.g3d.Basic3DSceneTest;
import com.badlogic.gdx.tests.g3d.Basic3DTest;
import com.badlogic.gdx.tests.g3d.Benchmark3DTest;
import com.badlogic.gdx.tests.g3d.FogTest;
import com.badlogic.gdx.tests.g3d.FrameBufferCubemapTest;
import com.badlogic.gdx.tests.g3d.HeightMapTest;
import com.badlogic.gdx.tests.g3d.LightsTest;
import com.badlogic.gdx.tests.g3d.MaterialEmissiveTest;
import com.badlogic.gdx.tests.g3d.MaterialTest;
import com.badlogic.gdx.tests.g3d.MeshBuilderTest;
import com.badlogic.gdx.tests.g3d.ModelCacheTest;
import com.badlogic.gdx.tests.g3d.ModelTest;
import com.badlogic.gdx.tests.g3d.MultipleRenderTargetTest;
import com.badlogic.gdx.tests.g3d.ParticleControllerInfluencerSingleTest;
import com.badlogic.gdx.tests.g3d.ParticleControllerTest;
import com.badlogic.gdx.tests.g3d.PolarAccelerationTest;
import com.badlogic.gdx.tests.g3d.ShaderCollectionTest;
import com.badlogic.gdx.tests.g3d.ShaderTest;
import com.badlogic.gdx.tests.g3d.ShadowMappingTest;
import com.badlogic.gdx.tests.g3d.SkeletonTest;
import com.badlogic.gdx.tests.g3d.TangentialAccelerationTest;
import com.badlogic.gdx.tests.g3d.TextureArrayTest;
import com.badlogic.gdx.tests.g3d.TextureRegion3DTest;
import com.badlogic.gdx.tests.g3d.utils.DefaultTextureBinderTest;
import com.badlogic.gdx.tests.g3d.voxel.VoxelTest;
import com.badlogic.gdx.tests.gles2.HelloTriangle;
import com.badlogic.gdx.tests.gles2.SimpleVertexShader;
import com.badlogic.gdx.tests.gles2.VertexArrayTest;
import com.badlogic.gdx.tests.gles3.GL30Texture3DTest;
import com.badlogic.gdx.tests.gles3.InstancedRenderingTest;
import com.badlogic.gdx.tests.gles3.PixelBufferObjectTest;
import com.badlogic.gdx.tests.math.CollisionPlaygroundTest;
import com.badlogic.gdx.tests.math.OctreeTest;
import com.badlogic.gdx.tests.math.collision.OrientedBoundingBoxTest;
import com.badlogic.gdx.tests.net.NetAPITest;
import com.badlogic.gdx.tests.superkoalio.SuperKoalio;
import com.badlogic.gdx.utils.ObjectMap;
import com.badlogic.gdx.utils.StreamUtils;
import com.badlogic.gdx.tests.AccelerometerTest;
import com.badlogic.gdx.tests.ActionSequenceTest;
import com.badlogic.gdx.tests.ActionTest;
import com.badlogic.gdx.tests.Affine2Test;
import com.badlogic.gdx.tests.AlphaTest;
import com.badlogic.gdx.tests.AnimationTest;
import com.badlogic.gdx.tests.AnnotationTest;
import com.badlogic.gdx.tests.AssetManagerTest;
import com.badlogic.gdx.tests.AtlasIssueTest;
import com.badlogic.gdx.tests.AudioDeviceTest;
import com.badlogic.gdx.tests.AudioRecorderTest;
import com.badlogic.gdx.tests.BigMeshTest;
import com.badlogic.gdx.tests.BitmapFontAlignmentTest;
import com.badlogic.gdx.tests.BitmapFontDistanceFieldTest;
import com.badlogic.gdx.tests.BitmapFontFlipTest;
import com.badlogic.gdx.tests.BitmapFontMetricsTest;
import com.badlogic.gdx.tests.BitmapFontTest;
import com.badlogic.gdx.tests.BitmapFontAtlasRegionTest;
import com.badlogic.gdx.tests.BlitTest;
import com.badlogic.gdx.tests.Box2DTest;
import com.badlogic.gdx.tests.Box2DTestCollection;
import com.badlogic.gdx.tests.Bresenham2Test;
import com.badlogic.gdx.tests.BufferUtilsTest;
import com.badlogic.gdx.tests.BulletTestCollection;
import com.badlogic.gdx.tests.ClipboardTest;
import com.badlogic.gdx.tests.CollectionsTest;
import com.badlogic.gdx.tests.ColorTest;
import com.badlogic.gdx.tests.ContainerTest;
import com.badlogic.gdx.tests.CoordinatesTest;
import com.badlogic.gdx.tests.CpuSpriteBatchTest;
import com.badlogic.gdx.tests.CullTest;
import com.badlogic.gdx.tests.CursorTest;
import com.badlogic.gdx.tests.DecalTest;
import com.badlogic.gdx.tests.DelaunayTriangulatorTest;
import com.badlogic.gdx.tests.DeltaTimeTest;
import com.badlogic.gdx.tests.DirtyRenderingTest;
import com.badlogic.gdx.tests.DownloadTest;
import com.badlogic.gdx.tests.DragAndDropTest;
import com.badlogic.gdx.tests.ETC1Test;
import com.badlogic.gdx.tests.EdgeDetectionTest;
import com.badlogic.gdx.tests.ExitTest;
import com.badlogic.gdx.tests.ExternalMusicTest;
import com.badlogic.gdx.tests.FilesTest;
import com.badlogic.gdx.tests.IsometricTileTest;
import com.badlogic.gdx.tests.KinematicBodyTest;
import com.badlogic.gdx.tests.KTXTest;
import com.badlogic.gdx.tests.LifeCycleTest;
import com.badlogic.gdx.tests.LabelTest;
import com.badlogic.gdx.tests.MatrixJNITest;
import com.badlogic.gdx.tests.MeshShaderTest;
import com.badlogic.gdx.tests.MeshWithCustomAttributesTest;
import com.badlogic.gdx.tests.MipMapTest;
import com.badlogic.gdx.tests.MultitouchTest;
import com.badlogic.gdx.tests.MusicTest;
import com.badlogic.gdx.tests.NinePatchTest;
import com.badlogic.gdx.tests.NoncontinuousRenderingTest;
import com.badlogic.gdx.tests.OnscreenKeyboardTest;
import com.badlogic.gdx.tests.PathTest;
import com.badlogic.gdx.tests.ParallaxTest;
import com.badlogic.gdx.tests.ParticleEmitterTest;
import com.badlogic.gdx.tests.ParticleEmittersTest;
import com.badlogic.gdx.tests.ParticleEmitterChangeSpriteTest;
import com.badlogic.gdx.tests.PixelPerfectTest;
import com.badlogic.gdx.tests.PixelsPerInchTest;
import com.badlogic.gdx.tests.PixmapBlendingTest;
import com.badlogic.gdx.tests.PixmapPackerTest;
import com.badlogic.gdx.tests.PixmapPackerIOTest;
import com.badlogic.gdx.tests.PixmapTest;
import com.badlogic.gdx.tests.PolygonRegionTest;
import com.badlogic.gdx.tests.PolygonSpriteTest;
import com.badlogic.gdx.tests.PreferencesTest;
import com.badlogic.gdx.tests.ProjectTest;
import com.badlogic.gdx.tests.ProjectiveTextureTest;
import com.badlogic.gdx.tests.ReflectionTest;
import com.badlogic.gdx.tests.ReflectionCorrectnessTest;
import com.badlogic.gdx.tests.RotationTest;
import com.badlogic.gdx.tests.RunnablePostTest;
import com.badlogic.gdx.tests.Scene2dTest;
import com.badlogic.gdx.tests.ScrollPane2Test;
import com.badlogic.gdx.tests.ScrollPaneScrollBarsTest;
import com.badlogic.gdx.tests.ScrollPaneTest;
import com.badlogic.gdx.tests.ScrollPaneTextAreaTest;
import com.badlogic.gdx.tests.ScrollPaneWithDynamicScrolling;
import com.badlogic.gdx.tests.SelectTest;
import com.badlogic.gdx.tests.SensorTest;
import com.badlogic.gdx.tests.ShaderMultitextureTest;
import com.badlogic.gdx.tests.ShapeRendererTest;
import com.badlogic.gdx.tests.ShapeRendererAlphaTest;
import com.badlogic.gdx.tests.ShortSoundTest;
import com.badlogic.gdx.tests.SimpleAnimationTest;
import com.badlogic.gdx.tests.SimpleDecalTest;
import com.badlogic.gdx.tests.SimpleStageCullingTest;
import com.badlogic.gdx.tests.SoftKeyboardTest;
import com.badlogic.gdx.tests.SortedSpriteTest;
import com.badlogic.gdx.tests.SoundTest;
import com.badlogic.gdx.tests.SpriteBatchOriginScaleTest;
import com.badlogic.gdx.tests.SpriteBatchRotationTest;
import com.badlogic.gdx.tests.SpriteBatchShaderTest;
import com.badlogic.gdx.tests.SpriteBatchTest;
import com.badlogic.gdx.tests.SpriteCacheOffsetTest;
import com.badlogic.gdx.tests.SpriteCacheTest;
import com.badlogic.gdx.tests.StageDebugTest;
import com.badlogic.gdx.tests.StagePerformanceTest;
import com.badlogic.gdx.tests.StageTest;
import com.badlogic.gdx.tests.SystemCursorTest;
import com.badlogic.gdx.tests.TableLayoutTest;
import com.badlogic.gdx.tests.TableTest;
import com.badlogic.gdx.tests.TextAreaTest;
import com.badlogic.gdx.tests.TextAreaTest2;
import com.badlogic.gdx.tests.TextAreaTest3;
import com.badlogic.gdx.tests.TextButtonTest;
import com.badlogic.gdx.tests.TextInputDialogTest;
import com.badlogic.gdx.tests.TextureAtlasTest;
import com.badlogic.gdx.tests.TextureDataTest;
import com.badlogic.gdx.tests.TextureDownloadTest;
import com.badlogic.gdx.tests.TextureFormatTest;
import com.badlogic.gdx.tests.TideMapAssetManagerTest;
import com.badlogic.gdx.tests.TideMapDirectLoaderTest;
import com.badlogic.gdx.tests.TileTest;
import com.badlogic.gdx.tests.TiledMapAnimationLoadingTest;
import com.badlogic.gdx.tests.TiledMapAssetManagerTest;
import com.badlogic.gdx.tests.TiledMapGroupLayerTest;
import com.badlogic.gdx.tests.TiledMapAtlasAssetManagerTest;
import com.badlogic.gdx.tests.TiledMapAtlasDirectLoaderTest;
import com.badlogic.gdx.tests.TiledMapDirectLoaderTest;
import com.badlogic.gdx.tests.TiledMapModifiedExternalTilesetTest;
import com.badlogic.gdx.tests.TiledMapObjectLoadingTest;
import com.badlogic.gdx.tests.TiledMapLayerOffsetTest;
import com.badlogic.gdx.tests.TimerTest;
import com.badlogic.gdx.tests.TimeUtilsTest;
import com.badlogic.gdx.tests.TouchpadTest;
import com.badlogic.gdx.tests.TreeTest;
import com.badlogic.gdx.tests.UBJsonTest;
import com.badlogic.gdx.tests.UITest;
import com.badlogic.gdx.tests.UISimpleTest;
import com.badlogic.gdx.tests.UtfFontTest;
import com.badlogic.gdx.tests.VBOWithVAOPerformanceTest;
import com.badlogic.gdx.tests.Vector2dTest;
import com.badlogic.gdx.tests.VertexBufferObjectShaderTest;
import com.badlogic.gdx.tests.VibratorTest;
import com.badlogic.gdx.tests.ViewportTest1;
import com.badlogic.gdx.tests.ViewportTest2;
import com.badlogic.gdx.tests.ViewportTest3;
import com.badlogic.gdx.tests.YDownTest;
import com.badlogic.gdx.tests.PngTest;
import com.badlogic.gdx.tests.JsonTest;
import com.badlogic.gdx.tests.QuadTreeFloatTest;
import com.badlogic.gdx.tests.QuadTreeFloatNearestTest;
import com.badlogic.gdx.tests.FilterPerformanceTest;
import com.badlogic.gdx.tests.FloatTextureTest;
import com.badlogic.gdx.tests.FrameBufferTest;
import com.badlogic.gdx.tests.FramebufferToTextureTest;
import com.badlogic.gdx.tests.FullscreenTest;
import com.badlogic.gdx.tests.Gdx2DTest;
import com.badlogic.gdx.tests.GestureDetectorTest;
import com.badlogic.gdx.tests.GLES30Test;
import com.badlogic.gdx.tests.GLProfilerErrorTest;
import com.badlogic.gdx.tests.GroupCullingTest;
import com.badlogic.gdx.tests.GroupFadeTest;
import com.badlogic.gdx.tests.GroupTest;
import com.badlogic.gdx.tests.HexagonalTiledMapTest;
import com.badlogic.gdx.tests.I18NMessageTest;
import com.badlogic.gdx.tests.I18NSimpleMessageTest;
import com.badlogic.gdx.tests.ImageScaleTest;
import com.badlogic.gdx.tests.ImageTest;
import com.badlogic.gdx.tests.ImmediateModeRendererTest;
import com.badlogic.gdx.tests.IndexBufferObjectShaderTest;
import com.badlogic.gdx.tests.InputTest;
import com.badlogic.gdx.tests.IntegerBitmapFontTest;
import com.badlogic.gdx.tests.InterpolationTest;
import com.badlogic.gdx.tests.IntersectorOverlapConvexPolygonsTest;
import com.badlogic.gdx.tests.InverseKinematicsTest;
import com.badlogic.gdx.tests.LabelScaleTest;
import com.badlogic.gdx.tests.g2d.ProgressiveJPEGTest;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * List of GdxTest classes. To be used by the test launchers. If you write your own test, add it in here!
 *
 * @author badlogicgames@gmail.com
 */
public class GdxTests {
    public static final List<Class<? extends GdxTest>> tests = new ArrayList<>(Arrays.asList(
            IssueTest.class,
            AccelerometerTest.class,
            ActionSequenceTest.class,
            ActionTest.class,
            Affine2Test.class,
            AlphaTest.class,
            Animation3DTest.class,
            AnimationTest.class,
            AnisotropyTest.class,
            AnnotationTest.class,
            AssetManagerTest.class,
            AtlasIssueTest.class,
            AudioDeviceTest.class,
            AudioRecorderTest.class,
            AudioSoundAndMusicIsolationTest.class,
            Basic3DSceneTest.class,
            Basic3DTest.class,
            Benchmark3DTest.class,
            BigMeshTest.class,
            BitmapFontAlignmentTest.class,
            BitmapFontDistanceFieldTest.class,
            BitmapFontFlipTest.class,
            BitmapFontMetricsTest.class,
            BitmapFontTest.class,
            BitmapFontAtlasRegionTest.class,
            BlitTest.class,
            Box2DTest.class,
            Box2DTestCollection.class,
            Bresenham2Test.class,
            BufferUtilsTest.class,
            BulletTestCollection.class,
            ClipboardTest.class,
            CollectionsTest.class,
            CollisionPlaygroundTest.class,
            ColorTest.class,
            ContainerTest.class,
            CoordinatesTest.class,
            CpuSpriteBatchTest.class,
            CullTest.class,
            CursorTest.class,
            DecalTest.class,
            DefaultTextureBinderTest.class,
            DelaunayTriangulatorTest.class,
            DeltaTimeTest.class,
            DirtyRenderingTest.class,
            DisplayModeTest.class,
            DownloadTest.class,
            DragAndDropTest.class,
            ETC1Test.class,
//		EarClippingTriangulatorTest.class,
            EdgeDetectionTest.class,
            ExitTest.class,
            ExternalMusicTest.class,
            FilesTest.class,
            FilterPerformanceTest.class,
            FloatTextureTest.class,
            FogTest.class,
            FrameBufferCubemapTest.class,
            FrameBufferTest.class,
            FramebufferToTextureTest.class,
            FullscreenTest.class,
            Gdx2DTest.class,
            GestureDetectorTest.class,
            GL30Texture3DTest.class,
            GLES30Test.class,
            GLProfilerErrorTest.class,
            GroupCullingTest.class,
            GroupFadeTest.class,
            GroupTest.class,
            HeightMapTest.class,
            HelloTriangle.class,
            HexagonalTiledMapTest.class,
            I18NMessageTest.class,
            I18NSimpleMessageTest.class,
            ImageScaleTest.class,
            ImageTest.class,
            ImmediateModeRendererTest.class,
            IndexBufferObjectShaderTest.class,
            InputTest.class,
            InstancedRenderingTest.class,
            IntegerBitmapFontTest.class,
            InterpolationTest.class,
            IntersectorOverlapConvexPolygonsTest.class,
            InverseKinematicsTest.class,
            IsometricTileTest.class,
            KinematicBodyTest.class,
            KTXTest.class,
            LabelScaleTest.class,
            LabelTest.class,
            LifeCycleTest.class,
            LightsTest.class,
            MaterialTest.class,
            MaterialEmissiveTest.class,
            MatrixJNITest.class,
            MeshBuilderTest.class,
            MeshShaderTest.class,
            MeshWithCustomAttributesTest.class,
            MipMapTest.class,
            ModelTest.class,
            ModelCacheTest.class,
            MoveSpriteExample.class,
            MultipleRenderTargetTest.class,
            MultitouchTest.class,
            MusicTest.class,
            NetAPITest.class,
            NinePatchTest.class,
            NoncontinuousRenderingTest.class,
            OctreeTest.class,
            OnscreenKeyboardTest.class,
            OrientedBoundingBoxTest.class,
            PathTest.class,
            ParallaxTest.class,
            ParticleControllerInfluencerSingleTest.class,
            ParticleControllerTest.class,
            ParticleEmitterTest.class,
            ProgressiveJPEGTest.class,
            ParticleEmittersTest.class,
            ParticleEmitterChangeSpriteTest.class,
            PixelBufferObjectTest.class,
            PixelPerfectTest.class,
            PixelsPerInchTest.class,
            PixmapBlendingTest.class,
            PixmapPackerTest.class,
            PixmapPackerIOTest.class,
            PixmapTest.class,
            PolarAccelerationTest.class,
            PolygonRegionTest.class,
            PolygonSpriteTest.class,
            PreferencesTest.class,
            ProjectTest.class,
            ProjectiveTextureTest.class,
            ReflectionTest.class,
            ReflectionCorrectnessTest.class,
            RotationTest.class,
            RunnablePostTest.class,
            Scene2dTest.class,
            ScrollPane2Test.class,
            ScrollPaneScrollBarsTest.class,
            ScrollPaneTest.class,
            ScrollPaneTextAreaTest.class,
            ScrollPaneWithDynamicScrolling.class,
            SelectTest.class,
            SensorTest.class,
            ShaderCollectionTest.class,
            ShaderMultitextureTest.class,
            ShaderTest.class,
            ShadowMappingTest.class,
            ShapeRendererTest.class,
            ShapeRendererAlphaTest.class,
            ShortSoundTest.class,
            SimpleAnimationTest.class,
            SimpleDecalTest.class,
            SimpleStageCullingTest.class,
            SimpleVertexShader.class,
            SkeletonTest.class,
            SoftKeyboardTest.class,
            SortedSpriteTest.class,
            SoundTest.class,
            SpriteBatchOriginScaleTest.class,
            SpriteBatchRotationTest.class,
            SpriteBatchShaderTest.class,
            SpriteBatchTest.class,
            SpriteCacheOffsetTest.class,
            SpriteCacheTest.class,
            StageDebugTest.class,
            StagePerformanceTest.class,
            StageTest.class,
            SuperKoalio.class,
            SystemCursorTest.class,
            TableLayoutTest.class,
            TableTest.class,
            TangentialAccelerationTest.class,
            TextAreaTest.class,
            TextAreaTest2.class,
            TextAreaTest3.class,
            TextButtonTest.class,
            TextInputDialogTest.class,
            TextureAtlasTest.class,
            TextureArrayTest.class,
            TextureDataTest.class,
            TextureDownloadTest.class,
            TextureFormatTest.class,
            TextureRegion3DTest.class,
            TideMapAssetManagerTest.class,
            TideMapDirectLoaderTest.class,
            TileTest.class,
            TiledMapAnimationLoadingTest.class,
            TiledMapAssetManagerTest.class,
            TiledMapGroupLayerTest.class,
            TiledMapAtlasAssetManagerTest.class,
            TiledMapAtlasDirectLoaderTest.class,
            TiledMapDirectLoaderTest.class,
            TiledMapModifiedExternalTilesetTest.class,
            TiledMapObjectLoadingTest.class,
            TiledMapBench.class,
            TiledMapLayerOffsetTest.class,
            TimerTest.class,
            TimeUtilsTest.class,
            TouchpadTest.class,
            TreeTest.class,
            UBJsonTest.class,
            UISimpleTest.class,
            UITest.class,
            UtfFontTest.class,
            VBOWithVAOPerformanceTest.class,
            Vector2dTest.class,
            VertexArrayTest.class,
            VertexBufferObjectShaderTest.class,
            VibratorTest.class,
            ViewportTest1.class,
            ViewportTest2.class,
            ViewportTest3.class,
            YDownTest.class,
            FreeTypeFontLoaderTest.class,
            FreeTypeDisposeTest.class,
            FreeTypeMetricsTest.class,
            FreeTypeIncrementalTest.class,
            FreeTypePackTest.class,
            FreeTypeAtlasTest.class,
            FreeTypeTest.class,
            InternationalFontsTest.class,
            PngTest.class,
            JsonTest.class,
            QuadTreeFloatTest.class,
            QuadTreeFloatNearestTest.class,
            VoxelTest.class


            // SoundTouchTest.class, Mpg123Test.class, WavTest.class, FreeTypeTest.class,
            // VorbisTest.class
    ));

    static final ObjectMap<String, String> obfuscatedToOriginal = new ObjectMap<>();
    static final ObjectMap<String, String> originalToObfuscated = new ObjectMap<>();

    static {
        InputStream mappingInput = GdxTests.class.getResourceAsStream("/mapping.txt");
        if (mappingInput != null) {
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new InputStreamReader(mappingInput), 512);
                while (true) {
                    String line = reader.readLine();
                    if (line == null) break;
                    if (line.startsWith("    ")) continue;
                    String[] split = line.replace(":", "").split(" -> ");
                    String original = split[0];
                    if (original.indexOf('.') != -1)
                        original = original.substring(original.lastIndexOf('.') + 1);
                    originalToObfuscated.put(original, split[1]);
                    obfuscatedToOriginal.put(split[1], original);
                }
                reader.close();
            } catch (Exception ex) {
                System.out.println("GdxTests: Error reading mapping file: mapping.txt");
                ex.printStackTrace();
            } finally {
                StreamUtils.closeQuietly(reader);
            }
        }
    }

    public static List<String> getNames() {
        List<String> names = new ArrayList<String>(tests.size());
        for (Class clazz : tests)
            names.add(obfuscatedToOriginal.get(clazz.getSimpleName(), clazz.getSimpleName()));
        Collections.sort(names);
        return names;
    }

    public static Class<? extends GdxTest> forName(String name) {
        name = originalToObfuscated.get(name, name);
        for (Class clazz : tests)
            if (clazz.getSimpleName().equals(name)) return clazz;
        return null;
    }

    public static GdxTest newTest(String testName) {
        testName = originalToObfuscated.get(testName, testName);
        try {
            return forName(testName).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
