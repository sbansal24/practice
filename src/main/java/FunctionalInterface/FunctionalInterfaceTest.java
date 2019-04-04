package FunctionalInterface;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        FunctionalRunnable test = new FunctionalTest();
        test.testOne();
        System.out.println("abc".startsWith("b"));
    }
}
