package General;

import java.util.Arrays;

public class ArrangeNegativeAndPositive {
    public static void main(String[] args) {
        int[] array = {12, 11, -13, -5, 6, -7, 5, -3, -6};

        int j = 0;
        // arrange positives and negatives in bunch
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j++;
            }
        }

        // arrange them alternatively
        int neg = 0, pos = j;
        while (pos < array.length && neg < pos && array[neg] < 0) {
            int temp = array[neg];
            array[neg] = array[pos];
            array[pos] = temp;
            pos++;
            neg += 2;
        }

        Arrays.stream(array).forEach(System.out::println);
    }
}
