package DesignPatterns.Factory;

public class FactoryPatternTest {
    public static void main(String[] args) {
        NavEvent adminFeeNavEvent = FactoryMethodImpl.getNavEventMethod(FeeType.ADMIN_FEE);
        adminFeeNavEvent.execute();
    }
}
