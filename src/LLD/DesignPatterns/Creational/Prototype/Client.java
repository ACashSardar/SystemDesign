package LLD.DesignPatterns.Creational.Prototype;

public class Client {
    public static void main(String[] args) {
        Student student = new Student(25, 1009, "Akash");
        Student cloneObj = (Student) student.clone();
        System.out.println(student);
        System.out.println(cloneObj);
    }
}
