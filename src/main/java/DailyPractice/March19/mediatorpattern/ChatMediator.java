package DailyPractice.March19.mediatorpattern;

public interface ChatMediator {
     void sendMessage(String Message, User user);
     void addUser(User user);
}
