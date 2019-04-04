package Algorithms.ArrayAlgorithms;

import java.util.Arrays;

public class DutchNationalFlagProblem {
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 1, 2, 0, 2, 0, 1, 0, 2, 0, 1, 2, 0, 1};
        Arrays.stream(arr).forEach(num -> System.out.print(num +" "));
        int mid = 0, low = 0;
        int high = arr.length - 1;
        int temp;
        while(mid<=high){
            switch (arr[mid]){
                case 0:{
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    mid++;
                    low++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }


            }
        }
        System.out.println();
        Arrays.stream(arr).forEach(num -> System.out.print(num +" "));
    }
}
