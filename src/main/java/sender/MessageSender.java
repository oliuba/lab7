package sender;

import user.User;

import java.util.Date;

public class MessageSender {
    public boolean send(String text, User user, String country) {
        Date currentDate = new Date();
        if (user.getCountry() == country && user.getLastActiveTime() == currentDate) {
            System.out.println("The message was sent to " + user.getMail());
        }
        return true;
    }
}
