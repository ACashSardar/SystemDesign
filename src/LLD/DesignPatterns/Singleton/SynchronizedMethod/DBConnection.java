package LLD.DesignPatterns.Singleton.SynchronizedMethod;

public class DBConnection {
    private static DBConnection dbConnection;
    private DBConnection(){

    }
    synchronized public  static  DBConnection getDbConnection(){
        // Problem: If two threads come to this line simultaneously then
        // synchronize method guarantees that only one thread can access
        // the method at a time however this Lock/Unlock mechanism is very slow.
        if (dbConnection==null){
            dbConnection=new DBConnection();
        }
        return dbConnection;
    }
}
