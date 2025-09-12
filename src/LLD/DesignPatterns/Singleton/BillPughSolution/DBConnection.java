package LLD.DesignPatterns.Singleton.BillPughSolution;

public class DBConnection {
    private DBConnection() {

    }

    // Nested class gets loaded only when it is used.
    private static class DBConnectionHelper {
        private static final DBConnection dbConnection = new DBConnection();
    }

    public static DBConnection getDbConnection() {
        return DBConnectionHelper.dbConnection;
    }
}
