package Algorithms.ArrayAlgorithms;

import java.util.Arrays;
import java.util.Stack;

public class DoubleIfNextNumberIsValid {
    public static void main(String[] args) {
        int arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
        Stack<Integer> stack = new Stack<>();
        int ptr = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != 0 && arr[i] == arr[i + i]) {
                arr[i] = 2 * arr[i];
                arr[i + 1] = 0;
                i++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[ptr] = arr[i];
                ptr++;
            }
        }
        while (ptr < n) {
            arr[ptr] = 0;
        }
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
    }
}
