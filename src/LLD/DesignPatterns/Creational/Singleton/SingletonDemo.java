package LLD.DesignPatterns.Creational.Singleton;


import LLD.DesignPatterns.Creational.Singleton.DoubleLocking.DBConnection;

public class SingletonDemo {
    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getDbConnection();
        System.out.println(dbConnection);
    }
}
