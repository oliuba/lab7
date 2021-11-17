package db;

import analytics.ReportBuilder;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Authorisation authorisation = new Authorisation();
        if (authorisation.authorize(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
