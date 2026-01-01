package LLD.DesignPatterns.Behavioral.ChainOfResponsibility;

public class ErrorLogProcessor extends LogProcessor {

    ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    void log(String message) {
        if (message.equals("Level1")) {
            System.out.println("Error message " + message);
        } else {
            super.log(message);
        }
    }
}
