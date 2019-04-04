package DailyPractice.March27.Observer;

public class ObserverOne implements Observer {
    @Override
    public void update(String str) {
        System.out.println("observer one is observing "+str);
    }
}
