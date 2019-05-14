package Algorithms.HashBasedAlgos;

import java.util.HashMap;
import java.util.Map;

public class MaxLengthWithSumZero {
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 6, 1, 10, 23};
        int max_len = 0;
        int sum = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] == 0 && max_len == 0) {
                max_len = 1;
            }
            if (sum == 0) {
                max_len = i + 1;
            }
            Integer prev_i = hm.get(sum);
            if (prev_i != null) {
                max_len = Math.max(max_len, i - prev_i);
            } else {
                hm.put(sum, i);
            }
        }
        System.out.println(max_len);
    }
}
