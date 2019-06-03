package Algorithms.SearchingAndSortingAlgos;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {6, 3, 7, 8, 9, 1, 2, 5};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
