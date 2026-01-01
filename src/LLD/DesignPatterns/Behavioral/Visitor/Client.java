package LLD.DesignPatterns.Behavioral.Visitor;

public class Client {
    public static void main(String[] args) {
        Patient[] patients = new Patient[]{new ChildPatient(), new AdultPatient(), new SeniorPatient()};
        DiagnosisVisitor diagnosisVisitor = new DiagnosisVisitor();
        BillingVisitor billingVisitor = new BillingVisitor();
        for (Patient patient : patients) {
            patient.accept(diagnosisVisitor);
            patient.accept(billingVisitor);
        }
    }
}
