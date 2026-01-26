package LLD.DesignPatterns.Structural.Facade;

public class Client {
    public static void main(String[] args) {
        VideoStreamingFacade facade = new VideoStreamingFacade();
        facade.playVideo("Oggy and the cockroaches S1 E1");
    }
}
