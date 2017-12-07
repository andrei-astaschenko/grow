package org.grow.concurrency.task;

import java.util.Random;
import java.util.concurrent.Callable;

public class Task implements Callable<String>{

    @Override
    public String call() throws Exception {
        Thread thread = Thread.currentThread();
        int delay = new Random().nextInt(3000);
        thread.sleep(delay);
        StringBuilder builder = new StringBuilder();
        builder.append("Thread: id=" + thread.getId());
        builder.append(", name=" + thread.getName());
        builder.append(", priority=" + thread.getPriority());
        builder.append("... delay=" + delay);
        return builder.toString();
    }

}
