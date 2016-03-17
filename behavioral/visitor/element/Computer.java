package behavioral.visitor.element;

import behavioral.visitor.visitor.ComputerPartVisitor;

public class Computer extends ComputerPart {

    private ComputerPart[] parts;

    public Computer(String brand, String model, Cpu cpu, Dram dram, Hdd hdd, Motherboard motherboard) {
        super(brand, model);
        parts = new ComputerPart[] { cpu, dram, hdd, motherboard };
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }

}