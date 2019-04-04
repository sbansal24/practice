package DailyPractice.March14.ObserverPattern;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);

    void notifyObservers();
    Object getUpdate(Observer observer);
}
