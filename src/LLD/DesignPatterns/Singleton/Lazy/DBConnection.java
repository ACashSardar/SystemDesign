package LLD.DesignPatterns.Singleton.Lazy;

public class DBConnection {
    private static DBConnection dbConnection;
    private DBConnection(){

    }
    public  static  DBConnection getDbConnection(){
        // Problem: If two thread comes to this line simultaneously then
        // both will find dbConnection value null. Thus, they will create
        // two instances of dbConnection
        if (dbConnection==null){
            dbConnection=new DBConnection();
        }
        return dbConnection;
    }
}
