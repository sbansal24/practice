package DesignPatterns.ChainOfResponsibility;

public class ChainOfResponsibilityExample {
    private DispenseChain dispenseChain;

    public ChainOfResponsibilityExample() {
        this.dispenseChain = new Dollar50Dispense();
        DispenseChain c2 = new Dollar20Dispense();
        dispenseChain.setNextChain(c2);
    }

    public static void main(String[] args) {
        ChainOfResponsibilityExample testClass = new ChainOfResponsibilityExample();
        int amount = 70;
        if (amount % 10 != 0) {
            System.out.println("inappropriate amount");
        } else {
            testClass.dispenseChain.dispense(new Currency(amount));
        }
    }
}
