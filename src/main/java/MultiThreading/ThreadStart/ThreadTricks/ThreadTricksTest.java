package MultiThreading.ThreadStart.ThreadTricks;

public class ThreadTricksTest {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        Thread thread1 = new Thread(() -> {
            try {
                parent.method3();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "thread 1");
        Thread thread2 = new Thread(() -> {
            try {
                child.method4();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "thread 2");
        thread1.start();
        thread2.start();


//        String str = "aabcaaabcaaaad";
//        String matcher = "aaa";
//        System.out.println(matcher.length());
//        System.out.println(str.substring(4, 4 + matcher.length()));
//        System.out.println(matcher.equals(str.substring(4, 4 + matcher.length())));
//
//        System.out.println(str);
    }
}
