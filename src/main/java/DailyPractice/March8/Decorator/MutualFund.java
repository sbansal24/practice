package DailyPractice.March8.Decorator;

public class MutualFund extends FundDecorator {
    MutualFund(Fund fund) {
        super(fund);
    }
    @Override
    public void create() {
        super.create();
        System.out.println("creating a basic fund");
    }
}
