package analytics;

import db.Authorisation;
import db.Database;

public class ReportBuilder {
    private Database db;
    public ReportBuilder(Database db) {
        this.db = db;
    }

    public static class Main {
        public static void main(String[] args) {
            Database db = new Database();
            Authorisation authorisation = new Authorisation();
            if (authorisation.authorize(db)) {
                ReportBuilder br = new ReportBuilder(db);
            }
        }
    }
}
