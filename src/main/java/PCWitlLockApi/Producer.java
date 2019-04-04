package PCWitlLockApi;

import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Producer implements  Runnable{

    private final Lock lock;
    private final List<Integer> list;
    private final Condition listIsFull;
    private final Condition listIsEmpty;

    public Producer(Lock lock, List<Integer> list, Condition listIsFull, Condition listIsEmpty) {
        this.lock = lock;
        this.list = list;
        this.listIsFull = listIsFull;
        this.listIsEmpty = listIsEmpty;
    }

    @Override
    public void run() {
        int i =0;
        while (true) {
            lock.lock();
            try {
                if(list.size() ==1){
                   listIsFull.await();
                }
                i++;
                System.out.println("Producer produced :" + i);
                list.add(i);
                Thread.sleep(200);
                listIsEmpty.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }
    }
}
