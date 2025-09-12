package LLD.DesignPatterns.Creational.Prototype;

public class Student implements Prototype {

    int age;
    private int rollNo;
    String name;

    Student(int age, int rollNo, String name) {
        this.age = age;
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new Student(age, rollNo, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}
