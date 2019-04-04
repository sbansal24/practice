package DesignPatterns.ProtoType;

public class ProtoTypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee = new Employee();
        employee.setEmployeeId("abc");
        employee.setEmployeeName("employee1");

        Employee employee1 = (Employee) employee.clone();
        employee1.setEmployeeName("employee2");
        Employee employee2 = (Employee) employee.clone();
        employee2.setEmployeeName("employee3");
    }
}
