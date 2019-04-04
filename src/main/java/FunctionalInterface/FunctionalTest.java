package FunctionalInterface;

public class FunctionalTest implements FunctionalRunnable {
    @Override
    public void test() {
        System.out.println("test interface");
    }

    @Override
    public void testOne() {
        System.out.println("implement interface method");
    }
}
