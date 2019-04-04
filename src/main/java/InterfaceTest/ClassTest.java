package InterfaceTest;

import customhashmap.Employee;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;

public class ClassTest {
    static int i ;

    public static void main(String[] args) {
        int i =0;
        System.out.println(i);
        {
            i = 20;
        }
        System.out.println(i);
        test(i);
        System.out.println(i);

        Map<String, String> map = new ConcurrentHashMap<>();
        map.put("abc", "xyz");
        System.out.println(map);
        PriorityQueue queue = new PriorityQueue();
        queue.add(new Employee(1,"abc"));
    }

    private static void test(int j) {
        i++;
        System.out.println(i);
    }
}
