package LLD.DesignPatterns.Behavioral.State;

public class Client {
    public static void main(String[] args) {
        TrafficLightContext context = new TrafficLightContext();
        // initially GREEN
        System.out.println(context.getColour());
        context.next(); // GREEN ---> YELLOW
        System.out.println(context.getColour());
        context.next(); // YELLOW ---> RED
        System.out.println(context.getColour());
        context.next(); // RED ---> GREEN
        System.out.println(context.getColour());
    }
}
