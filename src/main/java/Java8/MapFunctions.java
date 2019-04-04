package Java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.LongAdder;

public class MapFunctions {
    public static void main(String[] args) {
        int a[] = {10,20,30,10,40,30,20,50};
        Map<Integer, LongAdder> map = new HashMap<>();
        Arrays.stream(a).forEach(number -> {
//            map.computeIfPresent(number, k-> map.get(k)++);
            map.computeIfAbsent(number, k-> new LongAdder()).increment();
        });
        System.out.println(map);
    }
}
