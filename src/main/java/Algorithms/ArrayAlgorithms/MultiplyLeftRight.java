package Algorithms.ArrayAlgorithms;

import java.util.Arrays;

public class MultiplyLeftRight {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        int prev = arr[0];
        arr[0] = prev*arr[1];
        for(int i = 1; i<arr.length-1;i++){
            int current = arr[i];
            arr[i] = prev*arr[i+1];
            prev = current;
        }
        arr[arr.length-1]  = prev*arr[arr.length-1];

        Arrays.stream(arr).forEach(System.out::println);
    }
}
