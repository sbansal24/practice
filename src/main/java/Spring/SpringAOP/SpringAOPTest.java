package Spring.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAOPTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee.getEmployeeName());
        try {
            System.out.println(10/0);
            System.out.println("try block");
        } catch (ArithmeticException e){
            System.out.println("arithmetic exception");
        } finally{
            System.out.println("finally block");
        }
        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();
    }
}
