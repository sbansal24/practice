package Algorithms.ArrayAlgorithms;

import java.util.Arrays;

public class PrintPairWithNegativeAndPositive {
    public static void main(String[] args) {
        int arr[] = {1, -3, 2, 3, 6, -1};
        int n = arr.length;
        Arrays.sort(arr);
        boolean pair_exist = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (Arrays.binarySearch(arr, -arr[i]) != -1) {
                    System.out.println(arr[i] + " pair exist " + -arr[i]);
                    pair_exist = true;
                }
            } else {
                break;
            }
        }
        if (!pair_exist) {
            System.out.println("no pair exist in the array");
        }
    }
}
