package DailyPractice.March8.Decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Fund fund  = new HedgeFund(new BasicFund());
        fund.create();
    }
}
