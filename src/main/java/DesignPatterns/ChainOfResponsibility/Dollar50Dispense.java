package DesignPatterns.ChainOfResponsibility;

public class Dollar50Dispense implements DispenseChain {
    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 50) {
            int num = currency.getAmount() / 50;
            int remainder = currency.getAmount() % 50;
            System.out.println("Dispensing " + num + " 50$ note");
            if (remainder != 0) this.dispenseChain.dispense(new Currency(remainder));
        } else {
            this.dispenseChain.dispense(currency);
        }

    }
}
