package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class ShareTrading {
    public static void main(String[] args) {
//        int arr[] = {100, 500, 260, 310, 40, 535, 695};
        int arr[] = {100, 500, 560, 600, 660, 706};
        int i = 0;
        int n = arr.length;
        int count = 0;
        List<Interval> intervalList = new ArrayList<>();
        while (i < n - 1) {
            while (i < n - 1 && arr[i + 1] <= arr[i]) {
                i++;
            }
            if (i == n - 1)
                break;
            Interval interval = new Interval();
            interval.buy = i++;

            while (i < n - 1 && arr[i] >= arr[i - 1]) {
                i++;
            }
            interval.sell = i - 1;
            intervalList.add(interval);
            count++;
        }
        if (intervalList.isEmpty()) {
            System.out.println("no trade");
        } else {
            for (int j = 0; j < intervalList.size(); j++) {
                System.out.println(intervalList.get(j).buy + " " + intervalList.get(j).sell);
            }
        }
    }
}

class Interval {
    int buy;
    int sell;
}
