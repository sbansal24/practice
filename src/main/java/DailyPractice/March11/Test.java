package DailyPractice.March11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap<Investor, String> map = new TreeMap<>();//(Comparator.comparing(Investor::getInvestorId).thenComparing(Investor::getInvestorName));
        Investor investor1 = new Investor(1, "abc");
        Investor investor2 = new Investor(2, "xyz");
        Investor investor3 = new Investor(2, "pou");
        map.put(investor1, "yer");
        map.put(investor2, "ger");
        map.put(investor3, "good");
        System.out.println(investor2.hashCode());
        System.out.println(investor3.hashCode());

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(investor3));
        System.out.println(map.get(investor2));
        List<Integer> list = new ArrayList<>();
        ((ArrayList<Integer>) list).ensureCapacity(5);
    }
}
