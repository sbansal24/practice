package DailyPractice.March13;

import java.util.Collections;
import java.util.HashMap;

public class TestClass {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap();
        System.out.println(Integer.valueOf("3"));
        System.out.println(map.put(1,11));
//        System.out.println(map.put(1,20));
        System.out.println(map.getOrDefault(1,21)+21);

        System.out.println(map.remove(2));
        System.out.println(map);
//        map.forEach();
        Collections.unmodifiableMap(map);
    }
}
