package DailyPractice.March27.Observer;

import java.util.ArrayList;
import java.util.List;

public class CricketUpdateSubject implements Subject {
    private List<Observer> observers;

    public CricketUpdateSubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyUpdate(String str) {
        for (Observer observer : observers) {
            observer.update(str);
        }
    }
}
