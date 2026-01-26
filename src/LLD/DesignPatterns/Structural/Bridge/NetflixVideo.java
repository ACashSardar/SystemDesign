package LLD.DesignPatterns.Structural.Bridge;

public class NetflixVideo extends Video {

    public NetflixVideo(VideoProcessor processor) {
        super(processor);
    }

    @Override
    public void play(String videoName) {
        System.out.print("Netflix -> ");
        processor.process(videoName);
    }
}