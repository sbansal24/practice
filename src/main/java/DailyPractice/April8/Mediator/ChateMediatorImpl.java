package DailyPractice.April8.Mediator;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

//it will have the list of users and provide the logic for the communication between the users.
public class ChateMediatorImpl implements ChatMediator {
    private List<User> users;

    public ChateMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for(User u : users){
            if(u!=user){
                u.receiveMessage(message);
            }
        }

    }

    @Override
    public void addUser(User user) {
this.users.add(user);
    }
}
