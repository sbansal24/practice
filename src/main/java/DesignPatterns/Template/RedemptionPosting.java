package DesignPatterns.Template;

public class RedemptionPosting extends BaseTemplate {
    @Override
    public void postTransaction() {
        System.out.println("Redemption posting");
    }

    @Override
    public void postProcessing() {
        System.out.println("Redemption post processing");
    }
}
