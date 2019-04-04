package DailyPractice.March19.mediatorpattern;

import javax.jws.soap.SOAPBinding;

public class MediatorPatternTest {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediatorImpl();
        User user1 = new UserImpl(chatMediator, "user1");
        User user2 = new UserImpl(chatMediator, "user2");
        User user3 = new UserImpl(chatMediator, "user3");
        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        user1.send("hello all");
    }
}
