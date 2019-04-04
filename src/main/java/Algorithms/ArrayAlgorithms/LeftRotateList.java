package Algorithms.ArrayAlgorithms;

import java.util.Arrays;

public class LeftRotateList {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        int i1 = a.length;
        for(int i = 0; i<a.length;i++){

        }
        leftRotateList(a, 2);
        Arrays.stream(a).forEach(System.out::print);
    }

    private static void leftRotateList(int[] a, int rotation) {
        for (int i = 0; i < rotation; i++) {
            leftRotatebyOne(a, a.length);
        }
    }

    static void leftRotatebyOne(int arr[], int n) {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }
}
