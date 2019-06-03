package Algorithms.ArrayAlgorithms;

public class LongestSubArrayDivisbleByNumber {
    public static void main(String[] args) {
        int arr[] = {1, 7, 2, 6, 8, 100, 3, 6, 16};
        int k = 3;
        int length = 0;
        int max_len = -9999;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] % k == 0) {
                length++;
            } else {
                max_len = Math.max(length, max_len);
                length = 0;
            }
        }
        max_len = Math.max(length, max_len);
        System.out.println(max_len);
    }
}
