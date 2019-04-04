package SpringJdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class TransactionDaoImpl implements TransactionDao {
    private final JdbcTemplate jdbcTemplate;

    public TransactionDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        System.out.println("Transaction dao constructor method");
    }


    @Override
    public List<Transaction> getTransactions() {
        return jdbcTemplate.query("select * from transaction", new RowMapper<Transaction>() {
            @Override
            public Transaction mapRow(ResultSet resultSet, int i) throws SQLException {
                Transaction transaction = new Transaction(1, "abc", new Date());
                return transaction;
            }
        });
    }

    @PostConstruct
    public void init(){
        System.out.println("Transaction Dao in post construct method.");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Transaction dao in pre destroy method");
    }
}
