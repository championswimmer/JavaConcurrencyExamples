package tech.arnav;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AbstractCounter c = new AtomicCounter();

        long pStart = System.currentTimeMillis();
        c.parallelOps(20);
        long pEnd = System.currentTimeMillis();
        Thread.sleep(1000);
        System.out.println("===================");
        long sStart = System.currentTimeMillis();
        c.sequentialOps(20);
        long sEnd = System.currentTimeMillis();
        Thread.sleep(1000);

        System.out.println("====== BENCHMARKS ======= ");
        System.out.println("parallel: time = " + (pEnd - pStart));
        System.out.println("sequential: time = " + (sEnd - sStart));

    }
}