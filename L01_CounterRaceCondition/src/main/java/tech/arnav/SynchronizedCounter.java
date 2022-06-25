package tech.arnav;

public class SynchronizedCounter extends AbstractCounter {
    volatile int count = 0;

    @Override
    protected synchronized void increment() {
        count++;
        System.out.println("increment: count: " + count);
    }

    @Override
    protected synchronized void decrement() {
        count--;
        System.out.println("decrement: count: " + count);
    }


}
