package LLD.DesignPatterns.Singleton.DoubleLocking;

public class DBConnection {
    private static DBConnection dbConnection;

    private DBConnection() {

    }

    public static DBConnection getDbConnection() {
        if (dbConnection == null) {
            synchronized (DBConnection.class) {
                if (dbConnection == null) {
                    dbConnection = new DBConnection();
                }
            }
        }
        return dbConnection;
    }
}
