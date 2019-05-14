package Algorithms.ArrayAlgorithms;

import java.util.Arrays;

public class PutAllZerosAtLast {
    public static void main(String[] args) {
       int[] arr = {1,2,0,4,3,0,5,0};
       int count = 0;
       for(int i = 0; i<arr.length;i++){
           if(arr[i]!=0){
               arr[count++] = arr[i];
           }
       }
       while(count<arr.length){
           arr[count++] = 0;
       }
        Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
    }
}
