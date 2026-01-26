package LLD.DesignPatterns.Structural.Bridge;

public class EightKProcessor implements VideoProcessor {
    @Override
    public void process(String videoName) {
        System.out.println("Processing " + videoName + " in 8K quality");
    }
}