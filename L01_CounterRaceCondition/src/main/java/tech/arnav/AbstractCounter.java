package tech.arnav;

import java.util.ArrayList;

public abstract class AbstractCounter {

    abstract protected void increment();

    abstract protected void decrement();

    public void parallelOps(int iteration) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < iteration; i++) {
                increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < iteration; i++) {
                decrement();
            }
        });

        t1.start();
        t2.start();
//        t1.join();
//        t2.join();
    }

    public void sequentialOps(int iterations) {
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < iterations; i++) {
            threads.add(new Thread(() -> {
                increment();
                decrement();
            }));
        }

        threads.forEach(Thread::start);
//        threads.forEach(thread -> {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
    }
}
