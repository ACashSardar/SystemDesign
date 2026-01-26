package LLD.DesignPatterns.Creational.Builder;

public class Director {
    ComputerBuilder builder;

    Director(ComputerBuilder builder) {
        this.builder = builder;
    }

    public ComputerBuilder buildWindowsLaptop() {
        return this.builder
                .setCPU("Intel Core I3")
                .setRAM("8 GB")
                .setStorage("1TB")
                .setOS("Windows 11")
                .setBrowser("Chrome");
    }

    public ComputerBuilder buildMacLaptop() {
        return this.builder
                .setCPU("Apple M4")
                .setRAM("32 GB")
                .setStorage("500 GB")
                .setOS("MAC-OS")
                .setBrowser("Safari");
    }
}
