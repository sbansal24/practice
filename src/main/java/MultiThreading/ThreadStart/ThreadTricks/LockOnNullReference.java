package MultiThreading.ThreadStart.ThreadTricks;

import java.util.ArrayList;
import java.util.List;

public class LockOnNullReference {
    private static LockOnNullReference lockOnNullReference ;

    public static void main(String[] args) {
        testMethod();
    }

    private static void testMethod() {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        testMethod(list);
        synchronized (lockOnNullReference){
            System.out.println("hello World");
        }
    }
    // ? extends Number is called the covariance
    private static void testMethod(List<? extends Number> list){

    }

    private static void testMethod1(List<? super Integer> list){

    }
}
