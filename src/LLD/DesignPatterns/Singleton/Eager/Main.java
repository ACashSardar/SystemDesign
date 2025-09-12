package LLD.DesignPatterns.Singleton.Eager;

public class Main{
    public static void main(String[] args) {
        DBConnection dbConnection=DBConnection.getDbConnection();
        System.out.println(dbConnection);
    }
}