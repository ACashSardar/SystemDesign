package LLD.DesignPatterns.Behavioral.ChainOfResponsibility;

public class DebugLogProcessor extends LogProcessor {
    DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    void log(String message) {
        if (message.equals("Level3")) {
            System.out.println("Debug message " + message);
        } else {
            super.log(message);
        }
    }
}
