import ThreeThreadCommunication.IntegerStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenericExamples {
    static private int i = 10;

    public static void main(String[] args) {
        System.out.println(i);
        IntegerStack integerStack = new IntegerStack(5);
        Stack stack = integerStack;
//        stack.push("abc");
//        System.out.println(integerStack.pop());
        List<? super Integer> list = new ArrayList<>();
        list.add(new Integer(10));
        list.add(40);
        System.out.println(list);
        List list1 = new ArrayList();
        list1.add("hello");
        test(list1);
    }

    public static void test(List<? super Integer> list) {
        list.stream().forEach(System.out::println);
    }

    public void test() {
        i++;
    }
}


