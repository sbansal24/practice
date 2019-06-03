package Algorithms.ArrayAlgorithms;

public class FindMissingNumberFromDuplicateArray {
    public static void main(String[] args) {
        int arr1[] = {4, 8, 1, 3, 7};
        int arr2[] = {7, 8, 3, 1};
        int n = arr1.length;
        int missingNumber = 0;
        for (int i = 0; i < n; i++) {
            missingNumber = missingNumber ^ arr1[i];
        }
        for (int i = 0; i < n - 1; i++) {
            missingNumber = missingNumber ^ arr2[i];
        }
        System.out.println(missingNumber);
    }
}
