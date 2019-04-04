package Semaphores;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class EvenThread implements Runnable {
    private final AtomicInteger number;
    private  final Semaphore oddSemaphore;
    private final Semaphore evenSemaphore;

    public EvenThread(AtomicInteger number, Semaphore oddSemaphore, Semaphore evenSemaphore) {
        this.number = number;
        this.oddSemaphore = oddSemaphore;
        this.evenSemaphore = evenSemaphore;
    }

    @Override
    public void run() {
        while (true) {
            try {
                evenSemaphore.acquire();
                System.out.println("by even thread:" + number.incrementAndGet());
                Thread.sleep(300);
                oddSemaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
