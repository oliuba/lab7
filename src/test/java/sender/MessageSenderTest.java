package sender;

import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.TwitterUser;
import user.MyFacebookUser;
import user.MyTwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {
    private MessageSender ms;

    @BeforeEach
    void setUp() {
        ms = new MessageSender();
    }

    @Test
    void send() {
        Date date = new Date();
        assertTrue(ms.send("Message", new MyTwitterUser(new TwitterUser("email@gmail.com", "Ukraine", date)), "Ukraine"));
        assertTrue(ms.send("Message", new MyFacebookUser(new FacebookUser("email@gmail.com", "Ukraine", date)), "Ukraine"));
    }
}