package DailyPractice.March12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapComputeExample {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 1, 2, 2, 3, 3, 4, 4, 4, 3, 3, 5, 6};
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(arr).forEach(val -> map.compute(val, (k, v) -> v == null ? 1 : v + 1));

        map.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
