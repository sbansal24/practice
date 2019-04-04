package DesignPatterns.Observer2;

public interface Subject {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObserver();
}
