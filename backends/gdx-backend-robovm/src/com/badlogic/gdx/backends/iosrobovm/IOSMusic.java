package com.badlogic.gdx.backends.iosrobovm;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.backends.iosrobovm.objectal.AVAudioPlayerDelegateAdapter;
import com.badlogic.gdx.backends.iosrobovm.objectal.OALAudioTrack;
import org.robovm.apple.foundation.NSObject;

public class IOSMusic implements Music {
    private final OALAudioTrack track;
    private final String filePath;
    OnCompletionListener onCompletionListener;
    private boolean initialized;
    private boolean looping;

    public IOSMusic(OALAudioTrack track, String filePath) {
        this.track = track;
        this.filePath = filePath;
        this.track.setDelegate(new AVAudioPlayerDelegateAdapter() {
            @Override
            public void didFinishPlaying(NSObject player, boolean success) {
                final OnCompletionListener listener = onCompletionListener;
                if (listener != null) {
                    Gdx.app.postRunnable(new Runnable() {
                        @Override
                        public void run() {
                            listener.onCompletion(IOSMusic.this);
                        }
                    });
                }
            }
        });
    }

    @Override
    public void play() {
        if (track.isPaused()) {
            track.setPaused(false);
        } else if (!track.isPlaying()) {
            // Check https://github.com/kstenerud/ObjectAL-for-iPhone/blob/master/ObjectAL/ObjectAL/AudioTrack/OALAudioTrack.m
            // OALAudioTrack needs to execute preloadURL() once to store the file path. From then on we avoid
            // calling it again to avoid instantiating a new AVAudioPlayer every time.
            if (!initialized) {
                if (!looping)
                    initialized = track.playFile(filePath);
                else
                    initialized = track.playFile(filePath, -1);
                if (!initialized) {
                    Gdx.app.error("IOSMusic", "Unable to initialize music " + filePath);
                }
            } else {
                track.play();
            }
        }
    }

    @Override
    public void pause() {
        if (track.isPlaying()) {
            track.setPaused(true);
        }
    }

    @Override
    public void stop() {
        track.stop();
    }

    @Override
    public boolean isPlaying() {
        return track.isPlaying() && !track.isPaused();
    }

    @Override
    public boolean isLooping() {
        return track.getNumberOfLoops() == -1;
    }

    @Override
    public void setLooping(boolean isLooping) {
        track.setNumberOfLoops(isLooping ? -1 : 0);
        looping = isLooping;
    }

    @Override
    public float getPosition() {
        return (float) (track.getCurrentTime());
    }

    @Override
    public void setPosition(float position) {
        track.setCurrentTime(position);
    }

    @Override
    public void dispose() {
        track.clear();
    }

    @Override
    public float getVolume() {
        return track.getVolume();
    }

    @Override
    public void setVolume(float volume) {
        track.setVolume(volume);
    }

    @Override
    public void setPan(float pan, float volume) {
        track.setPan(pan);
        track.setVolume(volume);
    }

    @Override
    public void setOnCompletionListener(OnCompletionListener listener) {
        this.onCompletionListener = listener;
    }

    /**
     * Calling this method preloads audio buffers and acquires the audio hardware necessary for playback. Can be noticeable on
     * latency critical scenarios. Call with some time before {@link #play()}.
     */
    public boolean preload() {
        return initialized = track.preloadFile(filePath);
    }

}
