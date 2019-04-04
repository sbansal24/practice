package CollectionPackage;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapByValue {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("abc", "def");
        map.put("zvd", "gdy");
        map.put("gyt", "rty");
        map.put("huy", "asd");
        map = sortMapByValue(map);
        System.out.println(map);
        map.entrySet().stream().forEach(System.out::println);

        TreeMap<String, String> treeMap = new TreeMap<>(map);
        System.out.println(treeMap);
    }

    private static Map<String,String> sortMapByValue(Map<String,String> map) {
        List<Map.Entry<String, String>> list = new ArrayList<>(map.entrySet());
        Map<String , String> linkedHashMap = new LinkedHashMap<>();
//        Collections.sort(list, Comparator.comparing(Map.Entry::getValue));
        list.sort(Comparator.comparing(Map.Entry::getValue));
        list.stream().forEach(entry -> linkedHashMap.put(entry.getKey(), entry.getValue()));
        return  linkedHashMap;
    }

    private static  Map<String,String> sortMapByKey(Map<String,String> map){
        List<Map.Entry<String, String>> list = new ArrayList<>(map.entrySet());
        Map<String , String> linkedHashMap = new LinkedHashMap<>();
//        Collections.sort(list, Comparator.comparing(Map.Entry::getValue));
        list.sort(Comparator.comparing(Map.Entry::getKey));
        list.stream().forEach(entry -> linkedHashMap.put(entry.getKey(), entry.getValue()));
        return  linkedHashMap;
    }
}
