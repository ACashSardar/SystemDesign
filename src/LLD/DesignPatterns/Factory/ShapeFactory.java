package LLD.DesignPatterns.Factory;

public class ShapeFactory {
    public Shape getShape(String name) {
        if (name.equals("CIRCLE")) {
            return new Circle();
        } else if (name.equals("SQUARE")) {
            return new Square();
        } else if (name.equals("TRIANGLE")) {
            return new Triangle();
        }
        return null;
    }
}
