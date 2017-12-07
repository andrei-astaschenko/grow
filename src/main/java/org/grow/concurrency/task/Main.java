package org.grow.concurrency.task;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int count = 50;
        ExecutorService service = Executors.newFixedThreadPool(count);
        List<Callable<String>> callables = new LinkedList();
        List<Future<String>> futures = new LinkedList();
        for(int i = 0; i < count; i++) {
            callables.add(new Task());
        }
        futures = service.invokeAll(callables);
        for(Future future: futures) {
            System.out.println(future.get());
        }
        service.shutdown();
    }
}
