package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "abc");
        Employee employee2 = new Employee(2, "xyz");
        Predicate<Employee> predicate = employee -> employee.getEmployeeId() >= 1;

        List<Employee> employeeList = Arrays.asList(employee1, employee2);
        employeeList.stream().filter(predicate.and(EmployeeNamePredicate.getNamePredicate())).forEach(employee ->{
            System.out.println(employee);
            System.out.println("***********");
        });

        employeeList.stream().forEach(System.out::println);

    }
}
