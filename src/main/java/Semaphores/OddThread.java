package Semaphores;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class OddThread implements Runnable{
    private final AtomicInteger number;
    private final Semaphore oddSemaphore;
    private final Semaphore evenSemaphore;

    public OddThread(AtomicInteger number, Semaphore oddSemaphore, Semaphore evenSemaphore) {
        this.number = number;
        this.oddSemaphore = oddSemaphore;
        this.evenSemaphore = evenSemaphore;
    }

    @Override
    public void run() {
        while (true) {
            try {
                oddSemaphore.acquire();
                System.out.println("by odd thread:" + number.incrementAndGet());
                Thread.sleep(300);
                evenSemaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
