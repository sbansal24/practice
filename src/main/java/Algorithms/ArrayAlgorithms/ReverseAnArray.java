package Algorithms.ArrayAlgorithms;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 2, 4, 9};
        int begin = 0, end = arr.length - 1;
        int temp;
        while (begin < end) {
            temp = arr[begin];
            arr[begin] = arr[end];
            arr[end] = temp;
            begin++;
            end--;
        }
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
        System.out.println(Math.floor(7 / 2));
    }
}
