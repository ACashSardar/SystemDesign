package LLD.DesignPatterns.Creational.Builder;

public class Client {
    public static void main(String[] args) {
        ComputerBuilder builder = new ComputerBuilder();

        // Default computer
        Computer computer1 = builder.build();
        System.out.println(computer1);

        // Customized computer
        Computer computer2 = builder
                .setCPU("Intel-I7")
                .setRAM("16 GB")
                .setStorage("500 GB")
                .setOS("Linux Ubuntu")
                .setBrowser("Firefox")
                .build();
        System.out.println(computer2);

        // Using Director
        Director windowsLaptopDirector = new Director(builder);
        Computer windowsLaptop = windowsLaptopDirector.buildWindowsLaptop().build();

        System.out.println(windowsLaptop);

        Director macLaptopDirector = new Director(builder);
        Computer macLaptop = macLaptopDirector.buildMacLaptop().build();

        System.out.println(macLaptop);

    }
}
