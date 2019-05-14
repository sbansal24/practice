package Algorithms.ArrayAlgorithms;

import java.util.Arrays;

public class EvenPositionNumberIsGreaterThanOddPositionNumber {
    public static void main(String[] args) {
        int arr[] = {8, 1, 5, 4, 7, 9, 2};
        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            if(i%2 == 1 && arr[i] > arr[i+1]){
//                int temp = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = temp;
//            }
//            if (i  % 2 == 0 && arr[i] < arr[i + 1]) {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
        Arrays.sort(arr);

        int ans[] = new int[n];
        int p = 0, q = n - 1;
        for (int i = 0; i < n; i++) {

            // Assign even indexes with maximum elements
            if ((i + 1) % 2 == 0)
                ans[i] = arr[q--];

                // Assign odd indexes with remaining elements
            else
                ans[i] = arr[p++];
        }
        Arrays.stream(ans).forEach(num -> System.out.print(num + " ,"));
    }
}
