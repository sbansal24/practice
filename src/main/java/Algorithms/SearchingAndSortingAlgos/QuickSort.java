package Algorithms.SearchingAndSortingAlgos;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {8, 2, 9, 1, 5, 7, 3, 4};
        quickSort(arr, 0, arr.length);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        return 0;
    }
}
