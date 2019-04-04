package DailyPractice.March12.TemplatePattern;

public class RedemptionPosting extends PostingTemplate {
    @Override
    public void preprocess(){
        System.out.println("redemption class pre process");
    }
    @Override
    public void process() {
        System.out.println("redemption posting");
    }
}
