package DailyPractice.March27.Observer;

public class ObserverThree implements Observer {
    @Override
    public void update(String str) {
        System.out.println("observer three is observing "+str);
    }
}
