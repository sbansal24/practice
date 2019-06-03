package Algorithms.ArrayAlgorithms;

import java.util.Arrays;

public class ArrangeOddAndEvenNumberPositions {
    public static void main(String[] args) {
        int arr[] = {6, 4, 2, 1, 8, 3};
        int n = arr.length;
        for(int i = 0 ; i<n-1;i++){
            if(i%2 == 0 && arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            if(i%2!=0 && arr[i]<arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        Arrays.stream(arr).forEach(System.out::print);
    }
}
