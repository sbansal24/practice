package PCWitlLockApi;

import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

 public class Consumer implements Runnable{
    private final Lock lock;
    private final List<Integer> list;
    private final Condition listIsFull;
    private final Condition listIsEmpty;

    public Consumer(Lock lock, List<Integer> list, Condition listIsFull, Condition listIsEmpty) {
        this.lock = lock;
        this.list = list;
        this.listIsFull = listIsFull;
        this.listIsEmpty = listIsEmpty;
    }


    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if(list.isEmpty()){
                    listIsEmpty.await();
                }
                System.out.println("Consumer Consumed :" + list.remove(0));
                Thread.sleep(200);
                listIsFull.signal();

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }
    }
}
