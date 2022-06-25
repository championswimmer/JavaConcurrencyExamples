package tech.arnav;

import java.util.ArrayList;

public class Counter extends AbstractCounter {
    int count = 0;

    @Override protected void increment() {
        count++;
        System.out.println("increment: count: " + count);
    }

    @Override protected void decrement() {
        count--;
        System.out.println("decrement: count: " + count);
    }




}
