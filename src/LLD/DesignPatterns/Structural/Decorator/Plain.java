package LLD.DesignPatterns.Structural.Decorator;

public class Plain implements BasePizza {
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public int getCost() {
        return 200;
    }

}
