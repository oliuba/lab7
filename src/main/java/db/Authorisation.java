package db;

public class Authorisation extends Авторизація{

    public boolean authorize(Database db) {
        db.getUserData();
        return true;
    }
}
