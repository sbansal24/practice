package Spring.SpringAOP;

public class Employee {
    private String employeeName;

    public String getEmployeeName() {
        System.out.println("name is :" + employeeName);
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void throwException() {
        throw new RuntimeException();
    }
}
