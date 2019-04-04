package MultiThreading.Exchanger;

import java.util.concurrent.Exchanger;

public class ProducerExchanger implements Runnable {
    private Exchanger<String> exchanger;
    private String message;

    public ProducerExchanger(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        this.message = new String();
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            message += i;
            System.out.println("producer is producing " + i);
            try {
                message =  exchanger.exchange(message);
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
