package Algorithms.ArrayAlgorithms;

import java.util.Arrays;

public class MoveAllZeroUsingSingleLoop {
    public static void main(String[] args) {
        int[] arr = {1,2,0,4,3,0,5,0};
        int count = 0;
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
    }
}
