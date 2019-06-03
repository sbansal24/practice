package Algorithms.ArrayAlgorithms;

public class LengthOfLongestSubArrayWithOnlyEvenNumber {
    public static void main(String[] args) {
        int arr[] = {9, 8, 5, 4, 4, 4, 2};
        int length = 0;
        int n = arr.length;
        int max_len = -999;
        for(int i = 0; i<n;i++){
            if(arr[i]%2 ==0){
                length++;
            } else{
                max_len = Math.max(max_len, length);
                length = 0;
            }
        }
        max_len = Math.max(max_len, length);
        System.out.println(max_len);
    }
}
