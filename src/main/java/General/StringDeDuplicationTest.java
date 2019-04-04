package General;

public class StringDeDuplicationTest {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = str1;
        String str3 = new String("hello");
        String str4 = new String("world");
        String str5 = "hello";

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
        System.out.println(str5.hashCode());
        System.out.println("hello".hashCode());

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1 == str3);
        System.out.println(str1 == str5);
        System.out.println("hello" == str5);
    }
}
