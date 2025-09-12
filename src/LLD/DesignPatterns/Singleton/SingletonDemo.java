package LLD.DesignPatterns.Singleton;


import LLD.DesignPatterns.Singleton.DoubleLocking.DBConnection;

public class SingletonDemo {
    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getDbConnection();
        System.out.println(dbConnection);
    }
}
