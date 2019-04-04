package OddEven;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class TestOddEven {

    public static void main(String[] args) {
        AtomicInteger number = new AtomicInteger(0);
        AtomicBoolean isOdd = new AtomicBoolean(true);

        OddThread oddThread = new OddThread(number, isOdd);

        Thread odd = new Thread(oddThread);
        Thread even = new Thread(new EvenThread(number, isOdd));
        odd.start();
        even.start();
    }
}
