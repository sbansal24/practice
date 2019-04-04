package DesignPatterns.Template;

public class TemplatePatterTest {
    public static void main(String[] args) {
        BaseTemplate template = new SubscriptionProcessing();
        template.execute();

        template = new RedemptionPosting();
        template.execute();
    }
}
