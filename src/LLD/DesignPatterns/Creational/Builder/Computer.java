package LLD.DesignPatterns.Creational.Builder;

public class Computer {
    public String CPU;
    public String RAM;
    public String storage;
    public String OS;
    public String browser;

    Computer(ComputerBuilder computerBuilder) {
        this.CPU = computerBuilder.CPU;
        this.RAM = computerBuilder.RAM;
        this.storage = computerBuilder.storage;
        this.OS = computerBuilder.OS;
        this.browser = computerBuilder.browser;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", OS='" + OS + '\'' +
                ", browser='" + browser + '\'' +
                '}';
    }
}
