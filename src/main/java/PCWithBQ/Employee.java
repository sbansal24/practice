package PCWithBQ;

public class Employee {
    private final int empId;
    private final String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }
}
