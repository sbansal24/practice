package General;

public class FindNumberInaSortedCircularArray {
    public static void main(String[] args) {
        int[] array = {12, 14, 18, 21, 3, 6, 8, 9};
        int position = getPosition(array, 18);
        System.out.println(position);
    }

    private static int getPosition(int[] array, int number) {
        int low = 0, high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (number == array[mid])
                return mid;
            if (array[mid] <= array[high]) {
                if (number > array[mid] && number <= array[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                if (number < array[mid] && number >= array[low]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
