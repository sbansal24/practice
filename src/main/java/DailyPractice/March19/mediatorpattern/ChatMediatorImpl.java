package DailyPractice.March19.mediatorpattern;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    List<User> list;

    public ChatMediatorImpl(){
        list = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for(User user1 : list){
            if(user1!=user){
                user1.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
list.add(user);
    }
}
