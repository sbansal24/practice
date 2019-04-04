package DailyPractice.March14.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsAgencyTopic implements Subject {
    private List<Observer> list;
    private String message;
    private boolean changed;

    public NewsAgencyTopic() {
        list = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if (!changed) {
            return;
        }
        List<Observer> localObservers = new ArrayList<>(list);
        this.changed = false;
        localObservers.forEach(observer -> observer.update());
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String msg){
        System.out.println("Message Posted to Topic: "+msg);
        this.message=msg;
        this.changed=true;
        notifyObservers();
    }
}
