package Immutability;

import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

public class ImmutabilityTest {

    public static void main(String[] args) {
        ImmutabilityTest test = new ImmutabilityTest();
        Date date = new Date();
        Investor investor1 = new Investor("investor1", 1, date);
        Investor investor2 = new Investor("investor1", 1,date);
        System.out.println(investor1);
        date.setTime(178178999798L);

        System.out.println(investor1);
        System.out.println(investor2);
        investor1.getJoinDate().setTime(111178789798L);

        System.out.println(investor1.getJoinDate());

        ConcurrentHashMap<String, Integer> hashMap = new ConcurrentHashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        hashMap.put("D", 4);
        hashMap.put("E", 5);
        hashMap.put("F", 6);
        hashMap.put("G", 7);

        hashMap.forEach((k, v) -> System.out.println("key-> " + k + "is related with value-> " + v + ", by thread-> " + Thread.currentThread().getName()));
        String[] strings = {"aba", "baba", "aba", "xzxb"};
        String[] queries = {"aba", "xzxb", "ab"};
        int[] ptr = test.validate(strings, queries);
        Arrays.stream(ptr).forEach(System.out::println);
    }


    private int[] validate(String[] strings, String[] queries) {
        int[] arr = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int ptr = 0;
            for (int j = 0; j < strings.length; j++) {
                if (strings[j].equals(queries[i])) {
                    ptr++;
                }
            }
            arr[i] = ptr;
        }
        return arr;
    }
}
