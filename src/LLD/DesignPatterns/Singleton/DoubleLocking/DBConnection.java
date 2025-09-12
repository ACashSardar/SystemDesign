package LLD.DesignPatterns.Singleton.DoubleLocking;

public class DBConnection {

    // When we make a variable volatile, any READ/WRITE operation will
    // be happening from main memory instead of L1 Cache (For a multicore CPU).
    private static volatile DBConnection dbConnection;

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
