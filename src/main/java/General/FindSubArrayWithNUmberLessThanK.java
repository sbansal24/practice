package General;

public class FindSubArrayWithNUmberLessThanK {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 7, 8, 9, 3, 2, 1, 2, 4};
        int k = 6;
        int count = 0, length = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > k) {
                count++;
            } else {
                length = Math.max(count, length);
                count = 0;
            }
        }

        if (count > 0) {
            length = Math.max(count, length);
        }
        System.out.println(length);

    }
}
