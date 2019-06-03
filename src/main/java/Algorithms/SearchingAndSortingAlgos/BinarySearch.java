package Algorithms.SearchingAndSortingAlgos;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 6, 7, 9, 12, 15, 16, 19, 20};
        int k = 15;
        int n = arr.length;
        int index = binarySearch(arr, 0, n - 1, k);
        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int low, int high, int k) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
