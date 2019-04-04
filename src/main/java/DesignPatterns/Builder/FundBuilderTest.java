package DesignPatterns.Builder;

public class FundBuilderTest {
    public static void main(String[] args) {

        Fund fund = new Fund.FundBuilder().fundId(1).fundName("test").fundType("mutualfund").build();
        Fund fund1 = new Fund.FundBuilder().copy(fund).fundId(2).build();
        Fund fund2 = new Fund.FundBuilder().fundId(2).build();
        System.out.println(fund1);
        System.out.println(fund2.getFundId());
    }
}
