package MultiThreading.Exchanger;

import java.util.concurrent.Exchanger;

public class ConsumerExchanger implements  Runnable {
    private Exchanger<String> exchanger;

    public ConsumerExchanger(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        for(int i = 0 ; i<=10;i++){
            try {
                System.out.println("consumer has consumed "+ exchanger.exchange(new String()));
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
