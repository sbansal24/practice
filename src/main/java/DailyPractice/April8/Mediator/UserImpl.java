package DailyPractice.April8.Mediator;

//concrete class of user to be used by client system.
//sendMessage is using the mediator and it doesn't have any idea how it will be handled by the mediator.
public class UserImpl extends User {
    public UserImpl(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(this.name + ": Sending Message=" + message);
        chatMediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + ": Received Message:" + message);
    }
}
