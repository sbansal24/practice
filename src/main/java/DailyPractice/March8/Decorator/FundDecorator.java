package DailyPractice.March8.Decorator;

public abstract class FundDecorator implements Fund {
    private Fund fund;
    FundDecorator(Fund fund){
        this.fund = fund;
    }
    @Override
    public void create() {
        this.fund.create();
    }
}
