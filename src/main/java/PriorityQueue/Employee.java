package PriorityQueue;

public class Employee {
    private final String empId;
    private final String empName;

    public Employee(String empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                '}';
    }
}
