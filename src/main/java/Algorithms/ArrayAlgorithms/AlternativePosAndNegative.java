package Algorithms.ArrayAlgorithms;

import java.util.Arrays;

public class AlternativePosAndNegative {
    public static void main(String[] args) {
        int[] arr = {10, -1, 2, -3, 4, 5, 6, -7, 8, 9};
        int n = arr.length;
        int i = -1;
        for (int j = 0; j < n; j++) {
            if (arr[j] < 0) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int positive = i + 1, negative = 0;
        while (positive < n && negative < positive && arr[negative] < 0) {
            int temp = arr[negative];
            arr[negative] = arr[positive];
            arr[positive] = temp;
            positive++;
            negative += 2;
        }
        Arrays.stream(arr).forEach(num -> System.out.print(num + " ,"));
    }
}
