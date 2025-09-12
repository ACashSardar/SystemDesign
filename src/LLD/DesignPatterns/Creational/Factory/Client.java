package LLD.DesignPatterns.Creational.Factory;

public class Client {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape1 = factory.getShape("SQUARE");
        Shape shape2 = factory.getShape("TRIANGLE");
        shape1.draw();
        shape2.draw();
    }
}
