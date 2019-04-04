package General.GenericTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GenericClassTest {
    public static void main(String[] args) {
        GenericClassTest test = new GenericClassTest();
        Object t = test.testMethod(3, "huhhu");
        System.out.println(t);
        System.out.println(test.testMethod("hello", 1));
        List<Integer> list = Arrays.asList(23, 45, 67, 33, 78, 12, 35);
//        List<Integer> integerList = list.stream().filter(mark -> mark > 33).filter(mark -> mark < 40).map(mark -> mark + 5).collect(Collectors.toList());
        list = list.stream().map(mark -> mark < 33 ? mark + 5 : mark).collect(Collectors.toList());
        System.out.println(list);
        list.sort(Comparator.comparingInt(o -> o));
        System.out.println(list);
        list.removeIf(mark -> mark < 40);
        System.out.println(list);
    }

    public <T> T testMethod(T t, T v) {
        t = v;
        return t;
    }
}
