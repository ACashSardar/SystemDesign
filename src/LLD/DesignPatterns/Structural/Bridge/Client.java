package LLD.DesignPatterns.Structural.Bridge;

public class Client {
    public static void main(String[] args) {
        Video youtubeHd = new YouTubeVideo(new HDProcessor());
        Video netflix4k = new NetflixVideo(new FourKProcessor());
        Video prime8k = new PrimeVideo(new EightKProcessor());

        youtubeHd.play("Design Patterns Tutorial");
        netflix4k.play("Breaking Bad");
        prime8k.play("The Boys");
    }
}
