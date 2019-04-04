package DesignPatterns.ChainOfResponsibility;

public interface DispenseChain {
    void setNextChain(DispenseChain dispenseChain);
    void dispense(Currency currency);
}
