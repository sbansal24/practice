package DailyPractice.April1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = Arrays.asList("abc", "def", "get", "getab");
//        list.parallelStream().forEach(list1->map.put(list1, list1.length()));
        map = list.parallelStream().collect(Collectors.toMap(list1 -> list1, list1 -> list1.length()));
        System.out.println(map);
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);
        TestClass tc = new TestClass();
        tc.test(10);
        tc.test(null);
        tc.test(1.2);
        String str1 = "abcdefr";
        String str2 = "abcdefr";
        System.out.println(str1 == str2);
    }

    public void test(int i) {
        System.out.println("int function");
    }

    public void test(Integer i) {
        System.out.println("Integer function");
    }

    public void test(float i) {
        System.out.println("float function");
    }

    public void test(double i) {
        System.out.println("double function");
    }

    public void test(Number i) {
        System.out.println("Number function");
    }

}
