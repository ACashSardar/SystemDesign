package LLD.DesignPatterns.Behavioral.ChainOfResponsibility;

public class InfoLogProcessor extends LogProcessor {
    InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    void log(String message) {
        if (message.equals("Level2")) {
            System.out.println("Info message " + message);
        } else {
            super.log(message);
        }
    }

}
