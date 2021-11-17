package user;

import facebook.FacebookUser;
import twitter.TwitterUser;

import java.util.Date;

public class MyTwitterUser implements User {
    private TwitterUser adaptee;

    public MyTwitterUser(TwitterUser adaptee) {
        this.adaptee = adaptee;
    }

    public String getMail() {
        return adaptee.getEmail();
    }
    public String getCountry() {
        return adaptee.getUserCountry();
    }
    public Date getLastActiveTime() {
        return adaptee.getUserActiveTime();
    }
}
