package ThreeThreadCommunication;

import java.util.concurrent.atomic.AtomicInteger;

public class TestClass {
    public static void main(String[] args) {
        AtomicInteger number = new AtomicInteger(0);
        int multiplier = 2;

        Turn turn = new Turn();
        turn.setFirst(true);

        Thread one = new Thread(new ThreadOne(number, turn, multiplier));
        Thread two = new Thread(new ThreadTwo(number, turn, multiplier));
        Thread three = new Thread(new ThreadThree(number, turn, multiplier));
        one.start();
        two.start();
        three.start();
    }
}
