package MultiThreading.ThreadStart.ThreadTricks;

public class LockOnNullReference {
    private static LockOnNullReference lockOnNullReference ;

    public static void main(String[] args) {
        testMethod();
    }

    private static void testMethod() {
        synchronized (lockOnNullReference){
            System.out.println("hello World");
        }
    }
}
