package LLD.DesignPatterns.Behavioral.ChainOfResponsibility;

public abstract class LogProcessor {
    LogProcessor nextLogProcessor;

    LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }

    void log(String message) {
        if (nextLogProcessor != null) {
            nextLogProcessor.log(message);
        }
    }
}
