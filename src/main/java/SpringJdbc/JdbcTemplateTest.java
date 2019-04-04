package SpringJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTemplateTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TransactionService transactionService = applicationContext.getBean("transactionService", TransactionService.class);
        System.out.println(transactionService.getTransactions());
        FundService fundService = applicationContext.getBean("fundService", FundService.class);
        fundService.testFundServiceMethod();
        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();
    }
}
