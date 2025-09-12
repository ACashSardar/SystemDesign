package LLD.DesignPatterns.Creational.Singleton.Eager;

public class DBConnection {
    // Problem: We are creating object event when we dont need it.
    // We should create object on demand.
    private static DBConnection dbConnection = new DBConnection();

    private DBConnection() {

    }

    public static DBConnection getDbConnection() {
        return dbConnection;
    }
}
