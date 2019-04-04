package Algorithms.ArrayAlgorithms;

import java.util.Arrays;
import java.util.List;

public class MaximumDifferenceInArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 10, 6, 4, 8, 1);
        int maxDifference = calculateMaxDifference(list);
        System.out.println(maxDifference);
    }

    private static int calculateMaxDifference(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        } else if (list.size() == 1) {
            return list.get(0);
        }
        int max_diff = list.get(1) - list.get(0);
        int min_num = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max_diff < list.get(i) - min_num) {
                max_diff = list.get(i) - min_num;
            }
            if (list.get(i) < min_num) {
                min_num = list.get(i);
            }
        }
        return max_diff;
    }
}
