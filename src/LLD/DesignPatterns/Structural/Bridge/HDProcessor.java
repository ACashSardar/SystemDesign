package LLD.DesignPatterns.Structural.Bridge;

public class HDProcessor implements VideoProcessor {
    @Override
    public void process(String videoName) {
        System.out.println("Processing " + videoName + " in HD quality");
    }
}