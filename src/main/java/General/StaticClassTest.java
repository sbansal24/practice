package General;

public class StaticClassTest {
    static int i;
    public static void main(String[] args) {
        System.out.println(test());
        System.out.println(i);
    }
    static int test(){
        int i = 0;
        i++;
        return i;
    }
}
