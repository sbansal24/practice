package DailyPractice.March14.ObserverPattern;

public class ObserverPatternTest {
    public static void main(String[] args) {
        NewsAgencyTopic topic = new NewsAgencyTopic();

        Observer observer1= new NewsAgencySubscriber("user1");
        topic.addObserver(observer1);

        observer1.setSubject(topic);

//        observer1.update();

        topic.postMessage("hello");
    }
}
