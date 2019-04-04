package PriorityQueue;

public class InnerClassTest {
   static class Test{
        public int i = 10;
        static void test(){
            System.out.println("in the inner class");
        }
    }

    public static void main(String[] args) {
        InnerClassTest test = new InnerClassTest();

    }
}
