package behavioral.visitor.visitor;

import behavioral.visitor.element.Computer;
import behavioral.visitor.element.Cpu;
import behavioral.visitor.element.Dram;
import behavioral.visitor.element.Hdd;
import behavioral.visitor.element.Motherboard;

public class BrandDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Computer brand: " + computer.getBrand());
    }

    @Override
    public void visit(Cpu cpu) {
        System.out.println("CPU brand: " + cpu.getBrand());
    }

    @Override
    public void visit(Dram dram) {
        System.out.println("DRAM brand: " + dram.getBrand());
    }

    @Override
    public void visit(Motherboard motherboard) {
        System.out.println("Motherboard brand: " + motherboard.getBrand());
    }

    @Override
    public void visit(Hdd hdd) {
        System.out.println("HDD brand: " + hdd.getBrand());
    }

}