package LLD.DesignPatterns.Structural.Bridge;

public class YouTubeVideo extends Video {

    public YouTubeVideo(VideoProcessor processor) {
        super(processor);
    }

    @Override
    public void play(String videoName) {
        System.out.print("YouTube -> ");
        processor.process(videoName);
    }
}