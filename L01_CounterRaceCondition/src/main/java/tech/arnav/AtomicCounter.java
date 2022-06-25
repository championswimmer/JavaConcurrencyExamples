package tech.arnav;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter extends AbstractCounter {
    AtomicInteger count = new AtomicInteger(0);

    @Override protected void increment() {
        count.set(count.get() + 1);
        System.out.println("increment: count: " + count);
    }

    @Override protected void decrement() {
        count.set(count.get() - 1);
        System.out.println("decrement: count: " + count);
    }




}
