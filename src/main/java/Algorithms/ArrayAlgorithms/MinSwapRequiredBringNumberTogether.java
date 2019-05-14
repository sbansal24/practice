package Algorithms.ArrayAlgorithms;

import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MinSwapRequiredBringNumberTogether {
    public static void main(String[] args) {
        LinkedBlockingQueue queue;
        ArrayBlockingQueue queue1;
        int arr[] = {2, 7, 9, 5, 8, 7, 4};
        int k = 5;
        int n = arr.length;
        int neg = 0;


        int count = (int) Arrays.stream(arr).filter(num -> num <= k).count();

        for (int i = 0; i < count; i++) {
            if (arr[i] > k) {
                neg++;
            }
        }
        int ans = neg;
        for (int i = 0, j = count; j < n; i++, j++) {
            if (arr[i] > k) {
                neg--;
            }
            if (arr[j] > k) {
                neg++;
            }
            ans = Math.min(ans, neg);
        }
        System.out.println(ans);

    }
}
