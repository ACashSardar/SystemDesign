package LLD.DesignPatterns.Behavioral.Visitor;

public class ChildPatient implements Patient {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
