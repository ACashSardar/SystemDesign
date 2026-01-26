package LLD.DesignPatterns.Structural.Bridge;

public abstract class Video {
    public VideoProcessor processor;

    protected Video(VideoProcessor processor) {
        this.processor = processor;
    }

    public abstract void play(String videoName);
}
