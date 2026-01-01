package LLD.DesignPatterns.Behavioral.ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        LogProcessor obj = new ErrorLogProcessor(new InfoLogProcessor(new DebugLogProcessor(null)));
        obj.log("Level2");
    }
}
