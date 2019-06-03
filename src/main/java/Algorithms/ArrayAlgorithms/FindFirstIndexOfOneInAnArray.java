package Algorithms.ArrayAlgorithms;

//this progrm is to find first index of 1 in an sorted 0 & 1 Array.
public class FindFirstIndexOfOneInAnArray {
    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1};
        int n = arr.length;
        int firstIndex = getFirstIndex(arr, 0, n - 1);
        System.out.println(firstIndex);
    }

    private static int getFirstIndex(int[] arr, int beg, int end) {
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (arr[mid] == 1 && (mid == 0 || arr[mid - 1] == 0)) {
                return mid;
            } else if (arr[mid] == 1) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        return -1;
    }
}
