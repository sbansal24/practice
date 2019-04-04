package SpringJdbc;

import org.springframework.beans.factory.annotation.Autowired;

public class FundServiceImpl implements FundService {
    @Autowired
    private FundDao fundDao;

    public void setFundDao(FundDao fundDao) {
        this.fundDao = fundDao;

    }

    @Override
    public void testFundServiceMethod() {
        System.out.println("testing FundServiceImpl");
        fundDao.fundDaoTestMethod();
    }


}
