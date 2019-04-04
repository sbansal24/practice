package OddEven;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class OddThread implements Runnable{
    private final AtomicInteger number;
    private final AtomicBoolean isOdd;
    public OddThread(AtomicInteger number, AtomicBoolean isOdd) {
        this.number = number;
        this.isOdd = isOdd;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (number) {
                try {
                    while (!isOdd.get()) {
                        number.wait();
                    }
                    System.out.println("by odd thread:"+ number.incrementAndGet());
                    Thread.sleep(300);
                    isOdd.set(false);
                    number.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
