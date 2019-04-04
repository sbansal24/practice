package DailyPractice.March14;

public class TestClass {
    private int a = 10;
    private static  int b = 20;
    private int c = 30;
    private static int d = 40;
    public static void main(String[] args) {
        int a = 11;
        int b = 22;
        int c = 33;
        int d = 44;
        TestClass testClass = new TestClass();
        TestClass.test testObject = testClass.new test();
        testObject.testMethod();
    }

    private class test{
        public void testMethod(){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);

        }
    }
}
