package Semaphores;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class SemaphoresTest {
    public static void main(String[] args) {
        Semaphore oddSemaphore = new Semaphore(1);
        Semaphore evenSemaphore = new Semaphore(0);
        AtomicInteger integer = new AtomicInteger(0);
        Thread oddThread = new Thread(new OddThread(integer, oddSemaphore, evenSemaphore));
        Thread evanThread = new Thread(new EvenThread(integer, oddSemaphore, evenSemaphore));
        oddThread.start();
        evanThread.start();
    }
}
