package Spring.SpringMultiDI;

import SpringJdbc.TransactionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MultiSpringContextTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TransactionService transactionService = applicationContext.getBean("transactionService", TransactionService.class);
        System.out.println(transactionService.getTransactions());

        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("applicationContextDuplicate.xml");
        TransactionService transactionService1 = applicationContext1.getBean("transactionService", TransactionService.class);
        System.out.println(transactionService1.getTransactions());

        System.out.println(5%4);
    }
}
