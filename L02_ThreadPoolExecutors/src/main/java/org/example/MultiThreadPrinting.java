package org.example;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MultiThreadPrinting {
    private int until;
    private int threads;

    private ThreadPoolExecutor executor = new ThreadPoolExecutor(
            2,
            5,
            1,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(5)
    );

    public MultiThreadPrinting(int until, int threads) {
        this.until = until;
        this.threads = threads;
    }

    public void start() {
        for (int i = 0; i < threads; i++) {
            executor.execute(() -> {
                for (int j = 0; j < until; j++) {
                    System.out.println(Thread.currentThread().getName() + " : " + j);
                }
            });
        }
    }

}
