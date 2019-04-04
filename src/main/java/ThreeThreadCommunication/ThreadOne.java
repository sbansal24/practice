package ThreeThreadCommunication;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadOne implements Runnable {
    private final AtomicInteger number;
    private final Turn turn;
    private int multplier;

    public ThreadOne(AtomicInteger number, Turn turn, int multiplier) {
        this.number = number;
        this.turn = turn;
        this.multplier = multiplier;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (number) {
                try {
                    while (!turn.isFirst()) {
                        number.wait();
                    }
                    System.out.println("by thread one :"+ number.incrementAndGet());
                    Thread.sleep(500);
                    turn.setFirst(false);
                    turn.setSecond(true);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                number.notifyAll();
            }
        }
    }
}



