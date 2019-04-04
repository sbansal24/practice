package ThreeThreadCommunication;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTwo implements Runnable {
    private final AtomicInteger number;
    private final Turn turn;
    private int multplier;

    public ThreadTwo(AtomicInteger number, Turn turn, int multiplier) {

        this.number = number;
        this.turn = turn;
        this.multplier = multiplier;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (number) {
                try {
                    while (!turn.isSecond()) {
                        number.wait();
                    }
                    System.out.println("by thread second :"+  number.incrementAndGet());
                    Thread.sleep(500);
                    turn.setSecond(false);
                    turn.setThird(true);
                    number.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
