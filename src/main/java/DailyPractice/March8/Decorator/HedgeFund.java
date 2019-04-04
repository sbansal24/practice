package DailyPractice.March8.Decorator;

public class HedgeFund extends FundDecorator  {
    HedgeFund(Fund fund) {
        super(fund);
    }
    @Override
    public void create() {
        super.create();
        System.out.println("creating a hedge fund");
    }
}
