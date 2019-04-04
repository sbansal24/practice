package DeadLock;

public class DeadLockTest {
    public static void main(String[] args) {
        byte a = 127;
        byte b = 50;
        int i = a * b;
        System.out.println(i);
        String str1= "string1";
        String str2 = "String2";
//        Thread thread1 = new Thread( new Resource1(str1, str2), "SACHIN");
//        Thread thread2 = new Thread( new Resource2(str1, str2), "SASHAKT");
//        thread1.start();
//        thread2.start();

        byte var1 = -51, var2 = -28;
        System.out.println(var1&var2);
    }
}
