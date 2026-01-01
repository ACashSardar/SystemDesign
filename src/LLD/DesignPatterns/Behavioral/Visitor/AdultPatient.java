package LLD.DesignPatterns.Behavioral.Visitor;

public class AdultPatient implements Patient {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
