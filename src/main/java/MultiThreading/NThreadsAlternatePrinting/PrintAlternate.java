package MultiThreading.NThreadsAlternatePrinting;

import java.util.concurrent.atomic.AtomicInteger;

public class PrintAlternate implements Runnable {
    private final int numberOfThreads;
    private final AtomicInteger number;

    public PrintAlternate(int numberOfThreads, AtomicInteger number) {
        this.numberOfThreads = numberOfThreads;
        this.number = number;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (number) {

            }
        }

    }
}
