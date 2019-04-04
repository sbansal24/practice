package DailyPractice.March12.TemplatePattern;

public class TemplatePatternTest {
    public static void main(String[] args) {
        PostingTemplate postingTemplate = new SubscriptionPosting();
        postingTemplate.postTransaction();

        System.out.println("***************");
        postingTemplate = new RedemptionPosting();
        postingTemplate.postTransaction();
    }
}
