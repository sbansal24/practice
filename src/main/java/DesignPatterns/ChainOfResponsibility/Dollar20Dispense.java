package DesignPatterns.ChainOfResponsibility;

public class Dollar20Dispense implements DispenseChain {
    private DispenseChain dispenseChain;
    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 20) {
            int num = currency.getAmount() / 20;
            int remainder = currency.getAmount() % 20;
            System.out.println("Dispensing " + num + " 20$ note");
            if (remainder != 0) this.dispenseChain.dispense(new Currency(remainder));
        } else {
            this.dispenseChain.dispense(currency);
        }
    }
}
