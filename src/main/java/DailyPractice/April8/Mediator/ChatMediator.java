package DailyPractice.April8.Mediator;

public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
