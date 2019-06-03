package Algorithms.ArrayAlgorithms;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {1, 4, 20, 3, 10, 5};
        findSubArray(arr, arr.length, 33);
    }

    private static void findSubArray(int[] arr, int n, int sum) {
        int current_sum = arr[0];
        int start = 0;
        for (int i = 1; i <= n; i++) {
            while (current_sum > sum && start < i - 1) {
                current_sum = current_sum - arr[start];
                start++;
            }
            if (current_sum == sum) {
                int p = i - 1;
                System.out.println("sum has found on location " + start + " and:" + p);
                return;
            }
            if (i < n) {
                current_sum += arr[i];
            }
        }
        System.out.println("sum has not found");

    }
}
