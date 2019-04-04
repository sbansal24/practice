package MultiThreading.Exchanger;

import java.util.concurrent.Exchanger;

public class ExchangerTest {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        ProducerExchanger producerExchanger = new ProducerExchanger(exchanger);
        ConsumerExchanger consumerExchanger = new ConsumerExchanger(exchanger);

        Thread producerThread = new Thread(producerExchanger, "producer");
        Thread consumerThread = new Thread(consumerExchanger, "consumer");
        producerThread.start();
        consumerThread.start();
    }
}
