package LLD.DesignPatterns.Factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape1 = factory.getShape("SQUARE");
        Shape shape2 = factory.getShape("TRIANGLE");
        System.out.println(shape1);
        System.out.println(shape2);
    }
}
