package LLD.DesignPatterns.Structural.Bridge;

public class PrimeVideo extends Video {

    public PrimeVideo(VideoProcessor processor) {
        super(processor);
    }

    @Override
    public void play(String videoName) {
        System.out.print("Prime Video -> ");
        processor.process(videoName);
    }
}