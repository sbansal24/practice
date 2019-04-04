package PCWithBQ;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    private final BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int i = 0;
        while(true){
            System.out.println("Producing :"+ ++i);
            try {
                queue.put(i);
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
