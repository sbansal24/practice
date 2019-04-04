package PCWithBQ;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    private final BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                System.out.println("Consuming :"+queue.take());
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
