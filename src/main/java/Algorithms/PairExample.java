package Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PairExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(list);

        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        Map<String, String> integerMap = stringList.stream().collect(Collectors.toMap(str -> str, Function.identity()));
        System.out.println(integerMap);
    }
}
