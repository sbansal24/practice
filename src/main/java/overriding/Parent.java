package overriding;

public class Parent {
    public void test(){
        System.out.println("parent test");
    }

    public final void  testFinal(){
        System.out.println("parent final test");
    }
}
