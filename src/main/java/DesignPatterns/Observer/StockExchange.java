package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class StockExchange implements Subject {
    private List<Observer> observerList;
    private String message;
    private boolean changed;

    public StockExchange() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer == null)
            throw new NullPointerException("observer is null");

        if (!observerList.contains(observer)) {
            observerList.add(observer);
        }
    }

    @Override
    public void unRegister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if (!changed)
            return;
        changed = false;
        observerList.forEach(observer -> observer.update());
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public  void postMessage(String message){
        System.out.println("message posted to Stok Exchange " + message);
        this.message = message;
        this.changed = true;
        notifyObservers();
    }
}
