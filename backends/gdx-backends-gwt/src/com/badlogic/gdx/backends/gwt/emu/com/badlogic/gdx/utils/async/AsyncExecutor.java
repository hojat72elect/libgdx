package com.badlogic.gdx.utils.async;

import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.GdxRuntimeException;

/**
 * GWT emulation of AsynchExecutor, will call tasks immediately :D
 *
 * @author badlogic
 */
public class AsyncExecutor implements Disposable {
    /**
     * Creates a new AsynchExecutor with the name "AsynchExecutor-Thread".
     */
    public AsyncExecutor(int maxConcurrent) {
    }

    /**
     * Creates a new AsynchExecutor that allows maxConcurrent {@link Runnable} instances to run in parallel.
     *
     * @param maxConcurrent
     * @param name          The name of the threads.
     */
    public AsyncExecutor(int maxConcurrent, String name) {
    }

    /**
     * Submits a {@link Runnable} to be executed asynchronously. If maxConcurrent runnables are already running, the runnable will
     * be queued.
     *
     * @param task the task to execute asynchronously
     */
    public <T> AsyncResult<T> submit(final AsyncTask<T> task) {
        T result = null;
        try {
            result = task.call();
        } catch (Throwable t) {
            throw new GdxRuntimeException("Could not submit AsyncTask: " + t.getMessage(), t);
        }
        return new AsyncResult(result);
    }

    /**
     * Waits for running {@link AsyncTask} instances to finish, then destroys any resources like threads. Can not be used after
     * this method is called.
     */
    @Override
    public void dispose() {
    }
}
