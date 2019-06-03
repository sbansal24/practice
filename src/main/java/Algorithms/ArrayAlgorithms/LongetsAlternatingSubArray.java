package Algorithms.ArrayAlgorithms;

import java.util.Arrays;

public class LongetsAlternatingSubArray {
    public static void main(String[] args) {
        int arr[] = {-5, -1, -1, 2, -2, -3};
        int[] subArr = new int[arr.length];
        int n = arr.length;
        subArr[n-1] = 1;
        for(int i = n-2; i>=0;i--){
            if(arr[i]*arr[i+1]<0){
                subArr[i] = subArr[i+1]+1;
            } else{
                subArr[i] = 1;
            }

        }

        Arrays.stream(subArr).forEach(System.out::print);

    }
}
