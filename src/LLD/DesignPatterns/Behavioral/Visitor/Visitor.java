package LLD.DesignPatterns.Behavioral.Visitor;

public interface Visitor {
    void visit(ChildPatient childPatient);

    void visit(AdultPatient adultPatient);

    void visit(SeniorPatient seniorPatient);
}
