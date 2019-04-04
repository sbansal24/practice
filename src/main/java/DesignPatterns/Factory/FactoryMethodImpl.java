package DesignPatterns.Factory;

public class FactoryMethodImpl {
    public static NavEvent getNavEventMethod(FeeType feeType) {
        switch (feeType) {
            case ADMIN_FEE:
                return new AdminFee();
            case INCENTIVE_FEE:
                return new IncentiveFee();
            case MANAGEMENT_FEE:
                return new ManagementFee();
            default:
                throw new RuntimeException("wrong nav event type");
        }
    }
}
