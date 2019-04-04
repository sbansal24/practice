package Algorithms.ArrayAlgorithms;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int a[] = {1, 3, 4, 6, 7, 9, 28, 29, 67, 89};
        int b[] = {2, 5, 8, 10, 11, 23, 24};
        int c[] = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
        Arrays.stream(c).forEach(System.out::println);
    }
}
