package LLD.DesignPatterns.Structural.Bridge;

public class FourKProcessor implements VideoProcessor {
    @Override
    public void process(String videoName) {
        System.out.println("Processing " + videoName + " in 4K quality");
    }
}