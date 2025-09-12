package LLD.DesignPatterns.Creational.Factory;

public class ShapeFactory {

    // ShapeFactory has a shape
    public Shape shape;

    public Shape getShape(String name) {
        if (name.equals("CIRCLE")) {
            shape = new Circle();
        } else if (name.equals("SQUARE")) {
            shape = new Square();
        } else if (name.equals("TRIANGLE")) {
            shape = new Triangle();
        }
        return shape;
    }
}
