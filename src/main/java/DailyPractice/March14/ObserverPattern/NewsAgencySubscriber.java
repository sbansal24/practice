package DailyPractice.March14.ObserverPattern;

public class NewsAgencySubscriber implements Observer {
    private Subject topic;
    private String name;

    public NewsAgencySubscriber(String name){
        this.name = name;
    }

    @Override
    public void update() {
        String message = (String) topic.getUpdate(this);
        System.out.println(name + ": is consuming :" + message);
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
