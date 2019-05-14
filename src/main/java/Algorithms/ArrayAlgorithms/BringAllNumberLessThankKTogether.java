package Algorithms.ArrayAlgorithms;

public class BringAllNumberLessThankKTogether {
    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 5, 8, 7, 4};
        int k = 5;
        int ptr = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]<=k){
                int temp = arr[ptr];
                arr[ptr] = arr[i];
                arr[i] = temp;
            } else{

            }
        }
    }
}
