package com.badlogic.gdx.backends.iosrobovm;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.MathUtils;
import org.robovm.apple.audiotoolbox.AudioServices;
import org.robovm.apple.corehaptic.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.UIDevice;
import org.robovm.apple.uikit.UIImpactFeedbackGenerator;
import org.robovm.apple.uikit.UIImpactFeedbackStyle;
import org.robovm.apple.uikit.UIUserInterfaceIdiom;
import org.robovm.objc.block.VoidBlock1;

public class IOSHaptics {

    private final boolean vibratorSupport;
    private CHHapticEngine hapticEngine;
    private boolean hapticsSupport;

    public IOSHaptics(boolean useHaptics) {
        vibratorSupport = useHaptics && UIDevice.getCurrentDevice().getUserInterfaceIdiom() == UIUserInterfaceIdiom.Phone;
        if (NSProcessInfo.getSharedProcessInfo().getOperatingSystemVersion().getMajorVersion() >= 13) {
            hapticsSupport = useHaptics && CHHapticEngine.capabilitiesForHardware().supportsHaptics();
            if (hapticsSupport) {
                try {
                    hapticEngine = new CHHapticEngine();
                } catch (NSErrorException e) {
                    Gdx.app.error("IOSHaptics", "Error creating CHHapticEngine. Haptics will be disabled. " + e);
                    hapticsSupport = false;
                    return;
                }
                hapticEngine.setPlaysHapticsOnly(true);
                hapticEngine.setAutoShutdownEnabled(true);
                // The reset handler provides an opportunity to restart the engine.
                hapticEngine.setResetHandler(new Runnable() {
                    @Override
                    public void run() {
                        // Try restarting the engine.
                        hapticEngine.start(new VoidBlock1<NSError>() {
                            @Override
                            public void invoke(NSError nsError) {
                                if (nsError != null) {
                                    Gdx.app.error("IOSHaptics", "Error restarting CHHapticEngine. Haptics will be disabled.");
                                    hapticsSupport = false;
                                }
                            }
                        });
                    }
                });
            }
        }
    }

    public void vibrate(int milliseconds, boolean fallback) {
        if (hapticsSupport) {
            CHHapticPatternDict hapticDict = getChHapticPatternDict(milliseconds, 0.5f);
            try {
                CHHapticPattern pattern = new CHHapticPattern(hapticDict);
                NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
                hapticEngine.createPlayer(pattern).start(0, ptr);
                if (ptr.get() != null) {
                    Gdx.app.error("IOSHaptics", "Error starting haptics player. Error code: " + ptr.get().getLocalizedDescription());
                }
            } catch (NSErrorException e) {
                Gdx.app.error("IOSHaptics", "Error creating haptics pattern or player. " + e.getMessage());
            }
        } else if (fallback) {
            AudioServices.playSystemSound(4095);
        }
    }

    public void vibrate(int milliseconds, int amplitude, boolean fallback) {
        if (hapticsSupport) {
            float intensity = MathUtils.clamp(amplitude / 255f, 0, 1);
            CHHapticPatternDict hapticDict = getChHapticPatternDict(milliseconds, intensity);
            try {
                CHHapticPattern pattern = new CHHapticPattern(hapticDict);
                NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
                hapticEngine.createPlayer(pattern).start(0, ptr);
                if (ptr.get() != null) {
                    Gdx.app.error("IOSHaptics", "Error starting haptics pattern.");
                }
            } catch (NSErrorException e) {
                Gdx.app.error("IOSHaptics", "Error creating haptics player. " + e.getMessage());
            }
        } else {
            vibrate(milliseconds, fallback);
        }
    }

    private CHHapticPatternDict getChHapticPatternDict(int milliseconds, float intensity) {
        return new CHHapticPatternDict().setPattern(new NSArray<NSObject>(new CHHapticPatternDict()
                .setEvent(new CHHapticPatternDict().setEventType(CHHapticEventType.HapticContinuous).setTime(0.0)
                        .setEventDuration(milliseconds / 1000f)
                        .setEventParameters(new NSArray<NSObject>(new CHHapticPatternDict()
                                .setParameterID(CHHapticEventParameterID.HapticIntensity).setParameterValue(intensity).getDictionary())))
                .getDictionary()));
    }

    public void vibrate(Input.VibrationType vibrationType) {
        if (hapticsSupport) {
            UIImpactFeedbackStyle uiImpactFeedbackStyle;
            switch (vibrationType) {
                case LIGHT:
                    uiImpactFeedbackStyle = UIImpactFeedbackStyle.Light;
                    break;
                case MEDIUM:
                    uiImpactFeedbackStyle = UIImpactFeedbackStyle.Medium;
                    break;
                case HEAVY:
                    uiImpactFeedbackStyle = UIImpactFeedbackStyle.Heavy;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown VibrationType " + vibrationType);
            }
            UIImpactFeedbackGenerator uiImpactFeedbackGenerator = new UIImpactFeedbackGenerator(uiImpactFeedbackStyle);
            uiImpactFeedbackGenerator.impactOccurred();
        }
    }

    public boolean isHapticsSupported() {
        return hapticsSupport;
    }

    public boolean isVibratorSupported() {
        return vibratorSupport;
    }

}
