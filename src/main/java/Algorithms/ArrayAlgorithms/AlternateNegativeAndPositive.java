package Algorithms.ArrayAlgorithms;

import java.util.Arrays;

public class AlternateNegativeAndPositive {
    public static void main(String[] args) {
        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int n = arr.length;
        int temp;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (arr[i] > 0) {
                    int j = i + 1;
                    while (j < n) {
                        if (arr[j] < 0) {
                            break;
                        }
                        j++;
                    }
                    if (j >= n) {
                        break;
                    }
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            } else {
                if (arr[i] < 0) {
                    int j = i + 1;
                    while (j < n) {
                        if (arr[j] > 0) {
                            break;
                        }
                        j++;
                    }
                    if (j >= n) {
                        break;
                    }
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
    }
}
