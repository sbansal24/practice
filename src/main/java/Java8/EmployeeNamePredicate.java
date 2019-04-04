package Java8;

import java.util.function.Predicate;

public class EmployeeNamePredicate {

    public static Predicate<Employee>  getNamePredicate(){
        return  employee -> "abc".equals(employee.getEmployeeName()) || "xyz".equals(employee.getEmployeeName());
    }
}
