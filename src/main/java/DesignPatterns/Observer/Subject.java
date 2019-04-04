package DesignPatterns.Observer;

public interface Subject {
    void register(Observer observer);
    void unRegister(Observer observer);
    void notifyObservers();
    Object getUpdate(Observer observer);
}
