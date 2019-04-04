package DesignPatterns.Singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SingletonTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.hashCode());

        Class<Singleton> aClass = (Class<Singleton>) Class.forName("DesignPatterns.Singleton.Singleton");
        System.out.println(aClass.hashCode());
        Map<Integer, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        map.put(1, "abc");
        map.put(2, "abc1");
        map.put(3, "xyz");
        map.put(4, "rwr");
        map.put(5, "ide");
        map.put(6, "uio");
       list =  map.entrySet().stream().filter(entry->entry.getKey()<5)
                .map(Map.Entry::getValue).collect(Collectors.toList());
        System.out.println(list);
    }
}
