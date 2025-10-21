package LLD.DesignPatterns.Structural.Decorator;

public class Farmhouse implements BasePizza {
    @Override
    public String getDescription() {
        return "Farmhouse Pizza";
    }

    @Override
    public int getCost() {
        return 300;
    }
}
