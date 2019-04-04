package doublylinklist;

import customhashmap.Employee;

import java.util.*;

public class DoublyLinkListTest {
    public static void main(String[] args) {
        DoublyList doublyList = new DoublyList();
        doublyList.add(10);
        doublyList.add(22);
        doublyList.add(30);
        doublyList.add(40);

        doublyList.traverseList();
        System.out.println("***********************");
        doublyList.deleteNode(22);
        doublyList.traverseList();
        System.out.println("***********************");

        doublyList.insertAfter(50, 30);
        doublyList.traverseList();
        String[] array = new String[10];
        HashMap<String, Employee> map = new HashMap<>();
        Employee employee = new Employee(1, "a");
        map.put("x", employee);
        DoublyLinkListTest test = new DoublyLinkListTest();
        test.testMap(Collections.unmodifiableMap(map));
        System.out.println(map);
    }

    private void testMap(final Map<String, Employee> map){
        Map<String, Employee> newMap = new HashMap<>(map);
        Employee employee = new Employee(1, "a");
//        map.put("z", employee);
//        map = new HashMap<>();
        map.get("x").setEmpName("bhi");
//        map.put("y", employee);
        newMap.put("ye", employee);
    }
}
