package ThreeThreadCommunication;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadThree implements Runnable {
    private final AtomicInteger number;
    private final Turn turn;
    private  int multplier;

    public ThreadThree(AtomicInteger number, Turn turn, int multiplier) {
        this.number = number;
        this.turn = turn;
        this.multplier = multiplier;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (number) {
                try {
                    while (!turn.isThird()) {
                        number.wait();
                    }
                    System.out.println("by thread third :"+  number.incrementAndGet());
                    Thread.sleep(500);
                    turn.setThird(false);
                    turn.setFirst(true);
                    number.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
