package cn.l13z.builderMode;

import lombok.Data;

interface ComputerBuilder {

    void buildCpu();

    void buildMemory();

    void buildStorage();

    Computer getResult();
}

@Data
class Computer {

    private String cpu;
    private String memory;
    private String storage;
}

class ConcreteComputerBuilder implements ComputerBuilder {

    private final Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.setCpu("Intel i7");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("16GB DDR4");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("512GB SSD");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}

class ComputerDirector {

    private final ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void construct() {
        computerBuilder.buildCpu();
        computerBuilder.buildMemory();
        computerBuilder.buildStorage();
    }

    public Computer getResult() {
        return computerBuilder.getResult();
    }

}

class Client {

    public static void main(String[] args) {
        ConcreteComputerBuilder concreteComputerBuilder = new ConcreteComputerBuilder();
        ComputerDirector computerDirector = new ComputerDirector(concreteComputerBuilder);

        computerDirector.construct();
        Computer computer = computerDirector.getResult();

        System.out.println("Constructed Computer:");
        System.out.println("CPU: " + computer.getCpu());
        System.out.println("Memory: " + computer.getMemory());
        System.out.println("Storage: " + computer.getStorage());
    }
}
