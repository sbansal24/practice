package Algorithms.ArrayAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class DistributeArrayInPositiveAndNegativeSign {
    public static void main(String[] args) {
        int arr[] = {1, 2, -3, 4, -2, -8, -9, 3, 4};
        int n = arr.length;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (compareNumber(list1.get(0), arr[i])) {
                list2.add(arr[i]);
            } else {
                list1.add(arr[i]);
            }
        }
        list1.stream().forEach(System.out::print);
        System.out.println("");
        list2.stream().forEach(System.out::print);
        System.out.println();
        int a= 10;
        int b = 5;
        System.out.println(a^b);
        testFunction(list1);
        list1.stream().forEach(System.out::print);

    }

    private static void testFunction(final List<Integer> list1) {
        list1.add(10);
    }

    private static boolean compareNumber(Integer a, int b) {
        return (a ^ b) < 0;
    }


}
