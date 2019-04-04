package PriorityQueue;

import java.util.*;

public class PQTestClass {
    public static void main(String[] args) {
        List<Employee> set = new ArrayList<>();
        Employee e1 = new Employee("e1", "employee1");
        Employee e2 = new Employee("a1", "ztest");
        set.add(e1);
        set.add(e2);
        PriorityQueue<Employee> queue = new PriorityQueue<>(Comparator.comparing(Employee::getEmpId));
        queue.add(e1);
        queue.add(e2);
        System.out.println(queue);
        set.stream().sorted(Comparator.comparing(Employee::getEmpId).thenComparing(Employee::getEmpName))
                .forEach(System.out::println);
        Optional<Employee> max = set.stream().max(Comparator.comparing(Employee::getEmpId));
        System.out.println(max.get());
    }
}
