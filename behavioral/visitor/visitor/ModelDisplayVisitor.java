package behavioral.visitor.visitor;

import behavioral.visitor.element.Computer;
import behavioral.visitor.element.Cpu;
import behavioral.visitor.element.Dram;
import behavioral.visitor.element.Hdd;
import behavioral.visitor.element.Motherboard;

public class ModelDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Computer model: " + computer.getModel());
    }

    @Override
    public void visit(Cpu cpu) {
        System.out.println("CPU model: " + cpu.getModel());
    }

    @Override
    public void visit(Dram dram) {
        System.out.println("DRAM model: " + dram.getModel());
    }

    @Override
    public void visit(Motherboard motherboard) {
        System.out.println("Motherboard model: " + motherboard.getModel());
    }

    @Override
    public void visit(Hdd hdd) {
        System.out.println("HDD model: " + hdd.getModel());
    }

}