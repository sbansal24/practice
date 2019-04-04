package customhashmap;

import java.sql.SQLOutput;
import java.util.*;

public class Maptest {

    public static void main(String[] args) {
        Map<Employee, String> map = new HashMap<>();
        map.put(new Employee(1,"abc"), "abc");
        map.put(new Employee(2,"abc"), "aaa");
        map.put(new Employee(3,"abc"), "qwe");
        System.out.println(map.size());

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("xyz", "abc");
        EnumMap<Currency, String> enumMap = new EnumMap<>(Currency.class);
        enumMap.put(Currency.EUR, "abc");

        Set<Map.Entry<Employee, String>> entries = map.entrySet();
        for(Map.Entry<Employee, String> entry : entries){
            map.put(new Employee(4,"opo"), "iuo");
        }

        System.out.println(map);

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"abc"));
        list.add(new Employee(2,"abc"));

    }


}
