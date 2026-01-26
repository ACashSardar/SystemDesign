package LLD.DesignPatterns.Creational.Builder;

public class ComputerBuilder {
    public String CPU = "Intel-I5";
    public String RAM = "8 GB";
    public String storage = "1 TB";
    public String OS = "Windows";
    public String browser = "Chrome";

    public ComputerBuilder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    public ComputerBuilder setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }

    public ComputerBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public ComputerBuilder setOS(String OS) {
        this.OS = OS;
        return this;
    }

    public ComputerBuilder setBrowser(String browser) {
        this.browser = browser;
        return this;
    }

    public Computer build() {
        return new Computer(this);
    }

}
