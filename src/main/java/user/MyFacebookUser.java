package user;

import facebook.FacebookUser;

import java.util.Date;

public class MyFacebookUser implements User {
    private FacebookUser adaptee;

    public MyFacebookUser(FacebookUser adaptee) {
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
