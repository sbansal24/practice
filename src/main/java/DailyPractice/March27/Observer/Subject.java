package DailyPractice.March27.Observer;

public interface Subject {
    void register(Observer observer);
    void unRegister(Observer observer);
    void notifyUpdate(String str);

}
