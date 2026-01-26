package LLD.DesignPatterns.Structural.Facade;

public class VideoStreamingFacade {
    private AuthService authService;
    private VideoLoader videoLoader;
    private AudioSystem audioSystem;
    private VideoRenderer videoRenderer;

    public VideoStreamingFacade() {
        this.authService = new AuthService();
        this.videoLoader = new VideoLoader();
        this.audioSystem = new AudioSystem();
        this.videoRenderer = new VideoRenderer();
    }

    public void playVideo(String videoName) {
        authService.authenticate();
        videoLoader.loadVideo(videoName);
        audioSystem.setupAudio();
        videoRenderer.render();
        System.out.println("Video playback started");
    }
}
