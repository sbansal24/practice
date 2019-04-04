package DailyPractice.March12.TemplatePattern;

public class SubscriptionPosting extends PostingTemplate {
    @Override
    public void process() {
        System.out.println("subscription posting");
    }

    @Override
    public void postProcess(){
        System.out.println("subscription class post process");
    }
}
