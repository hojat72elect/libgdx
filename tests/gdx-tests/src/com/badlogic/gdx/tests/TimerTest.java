package com.badlogic.gdx.tests;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.tests.utils.GdxTestK;
import com.badlogic.gdx.utils.Timer;
import com.badlogic.gdx.utils.Timer.Task;

public class TimerTest extends GdxTestK {
    @Override
    public void create() {
        Timer timer = new Timer();
        Task task = timer.scheduleTask(new Task() {
            @Override
            public void run() {
                Gdx.app.log("TimerTest", "ping");
            }
        }, 1, 1);

        Gdx.app.log("TimerTest", "is task scheduled: " + task.isScheduled());
    }
}
