package SpringJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.PriorityQueue;

public class TransactionServiceImpl implements TransactionService {

    private TransactionDao transactionDao;

    @Autowired
    public void setTransactionDao(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
    }

    public TransactionServiceImpl(){
        System.out.println("spring in default construct method.");
    }

//    @Autowired
    public TransactionServiceImpl(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
        System.out.println("spring in parametrized construct method.");
    }


    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public List<Transaction> getTransactions() {
        return transactionDao.getTransactions();
    }

    @PostConstruct
    public void init(){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        System.out.println("spring in post construct method.");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("spring in pre destroy method");
    }
}
