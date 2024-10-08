package com.badlogic.gdx.backends.iosrobovm.objectal;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.AudioDevice;
import com.badlogic.gdx.audio.AudioRecorder;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.backends.iosrobovm.IOSApplicationConfiguration;
import com.badlogic.gdx.backends.iosrobovm.IOSAudio;
import com.badlogic.gdx.backends.iosrobovm.IOSMusic;
import com.badlogic.gdx.backends.iosrobovm.IOSSound;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.GdxRuntimeException;

public class OALIOSAudio implements IOSAudio {

    private final IOSApplicationConfiguration config;

    public OALIOSAudio(IOSApplicationConfiguration config) {
        this.config = config;
        OALSimpleAudio audio = OALSimpleAudio.sharedInstance();
        if (audio != null) {
            audio.setAllowIpod(config.allowIpod);
            audio.setHonorSilentSwitch(!config.overrideRingerSwitch);
        } else
            Gdx.app.error("IOSAudio", "No OALSimpleAudio instance available, audio will not be available");
    }

    @Override
    public AudioDevice newAudioDevice(int samplingRate, boolean isMono) {
        return new OALIOSAudioDevice(samplingRate, isMono, config.audioDeviceBufferSize, config.audioDeviceBufferCount);
    }

    @Override
    public AudioRecorder newAudioRecorder(int samplingRate, boolean isMono) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Sound newSound(FileHandle fileHandle) {
        return new IOSSound(fileHandle);
    }

    @Override
    public Music newMusic(FileHandle fileHandle) {
        String path = fileHandle.file().getPath().replace('\\', '/');
        OALAudioTrack track = OALAudioTrack.create();
        if (track != null) {
            return new IOSMusic(track, path);
        }
        throw new GdxRuntimeException("Error creating music audio track");
    }

    @Override
    public boolean switchOutputDevice(String deviceIdentifier) {
        return true;
    }

    @Override
    public String[] getAvailableOutputDevices() {
        return new String[0];
    }

    @Override
    public void didBecomeActive() {
        // workaround for ObjectAL crash problem
        // see: https://groups.google.com/g/objectal-for-iphone/c/ubRWltp_i1Q
        forceEndInterruption();
        if (config.allowIpod) {
            OALSimpleAudio audio = OALSimpleAudio.sharedInstance();
            if (audio != null) {
                audio.setUseHardwareIfAvailable(false);
            }
        }
    }

    @Override
    public void willEnterForeground() {
        // workaround for ObjectAL crash problem
        // see: https://groups.google.com/forum/?fromgroups=#!topic/objectal-for-iphone/ubRWltp_i1Q
        forceEndInterruption();
    }

    @Override
    public void willResignActive() {

    }

    @Override
    public void willTerminate() {

    }

    private void forceEndInterruption() {
        OALAudioSession audioSession = OALAudioSession.sharedInstance();
        if (audioSession != null) {
            audioSession.forceEndInterruption();
        }
    }
}
