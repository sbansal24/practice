package DailyPractice.March27.Observer;

public class ObserverPattrenTest {
    public static void main(String[] args) {
        Subject subject = new CricketUpdateSubject();
        Observer observer1 = new ObserverOne();
        Observer observer2 = new ObserverTwo();
        Observer observer3 = new ObserverThree();

        subject.register(observer1);
        subject.register(observer2);

        subject.notifyUpdate("update one");

        subject.unRegister(observer1);
        subject.register(observer3);

        subject.notifyUpdate("update two");

    }
}
