package General;

public class FindOccuranceInaSortedArray {
    public static void main(String[] args) {
        int[] array = {1, 1, 3, 3, 5, 5, 5, 5, 5, 7, 7, 9, 9};
        int firstIndex = binarySearch(array, 5, true);
        if(firstIndex == -1){
            System.out.println("number not present");
        }
        int lastIndex = binarySearch(array, 5, false);
        System.out.println("total number is :"+ (lastIndex -firstIndex+1));
    }

    private static int binarySearch(int[] array, int number, boolean searchFirst) {
        int low = 0, high = array.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == number) {
                result = mid;
                if (searchFirst) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (number < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}
