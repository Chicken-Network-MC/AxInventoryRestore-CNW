package com.artillexstudios.axinventoryrestore.queue;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class PriorityThreadedQueue {

    private static final ThreadFactory FACTORY = Thread.ofVirtual()
            .name("AxInventoryRestore-Datastore-thread-", 0)
            .uncaughtExceptionHandler((thread, throwable) -> throwable.printStackTrace())
            .factory();

    private static final Executor EXECUTOR = Executors.newThreadPerTaskExecutor(FACTORY);

    public void submit(Runnable task) {
        submit(task, Priority.LOW);
    }

    public void submit(Runnable task, Priority priority) {
        EXECUTOR.execute(task);
    }

}
