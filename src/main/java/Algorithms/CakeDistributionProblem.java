package Algorithms;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CakeDistributionProblem {
    private static DecimalFormat df2 = new DecimalFormat(".####");
    private static final double pi = 3.14159;

    public static void main(String[] args) {
        int arr[] = {4, 3, 3};
        int n = 5;
        List<Double> cakeAreaList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            cakeAreaList.add(Double.valueOf(df2.format(arr[i] * arr[i] * pi)));
        }
        Collections.sort(cakeAreaList, Collections.reverseOrder());

        cakeAreaList.forEach(value -> System.out.print(value + " "));
        List<Double> duplicateArea = cakeAreaList;
        Double bestArea = 0.00;
        int numberOfCake = 1;
        for (int i = 0; i < cakeAreaList.size(); i++) {
            int size = duplicateArea.size();
            bestArea = getBestArea(duplicateArea, n, numberOfCake);
            if (size == duplicateArea.size()) {
                break;
            }
            numberOfCake++;
//            if (numberOfCake >= duplicateArea.size()) {
//                break;
//            }
        }
        System.out.println();
        duplicateArea.forEach(value -> System.out.print(value + " "));
        System.out.println();
        System.out.println(bestArea);
    }

    private static Double getBestArea(List<Double> duplicateArea, int numberOfPeople, int numberOfCake) {
        Double totalCakeAreaSize = 0.00;
        for (int i = 0; i < numberOfCake; i++) {
            totalCakeAreaSize += duplicateArea.get(i);
        }
        Double firstDivison = Double.valueOf(df2.format(totalCakeAreaSize / numberOfPeople));
        Double low = 0.00, mid = 0.00;
        Double high = firstDivison;
        while (low <= high) {
            mid = (low + high) / 2;
            int num = findOptimal(duplicateArea, firstDivison, numberOfPeople, numberOfCake);
            if (num == numberOfPeople) {
                break;
            } else if (num < numberOfPeople) {

            } else {

            }
        }
        duplicateArea.removeIf(value -> value < firstDivison);
        return firstDivison;
    }

    private static int findOptimal(List<Double> duplicateArea, Double firstDivison, int numberOfPeople, int numberOfCake) {
        return 0;
    }
}
