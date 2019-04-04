package Algorithms.ArrayAlgorithms;

import java.util.Arrays;

public class ReArrangeSmallestAndLargest {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        int temp[] = new int[n];
        Arrays.sort(arr);
        int index = 0;

        for (int i = 0, j = n - 1; i <= n / 2 || j > n / 2; i++, j--) {
            if(index<n){
                temp[index] = arr[i];
                index++;
            }
            if(index<n){
                temp[index] = arr[j];
                index++;
            }
        }
        for(int i = 0; i<n;i++){
            arr[i] = temp[i];
        }
        Arrays.stream(arr).forEach(i-> System.out.print(i +" "));
    }
}
