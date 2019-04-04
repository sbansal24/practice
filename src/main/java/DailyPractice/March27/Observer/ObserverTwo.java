package DailyPractice.March27.Observer;

public class ObserverTwo implements Observer {
    @Override
    public void update(String str) {
        System.out.println("observer two is observing "+str);
    }
}
