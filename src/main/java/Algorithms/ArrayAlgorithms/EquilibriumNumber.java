package Algorithms.ArrayAlgorithms;

import java.util.concurrent.ConcurrentHashMap;

public class EquilibriumNumber {
    public static void main(String[] args) {
        ConcurrentHashMap map = new ConcurrentHashMap();
        int arr[] = {-7, 1, 5, 2, 4, 3, 0, 8};
        int sum = 0;
        int leftsum = 0;
        int i ;
        for (i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (i = 0; i < arr.length; i++) {
            sum -= arr[i];
            if (sum == leftsum) {
                break;
            }
            leftsum += arr[i];
        }
        System.out.println(i);
        try{
            System.exit(0);
        } finally {
            System.out.println("hello");
        }
    }
}
