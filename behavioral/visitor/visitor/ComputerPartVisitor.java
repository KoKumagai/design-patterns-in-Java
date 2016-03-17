package behavioral.visitor.visitor;

import behavioral.visitor.element.Computer;
import behavioral.visitor.element.Cpu;
import behavioral.visitor.element.Dram;
import behavioral.visitor.element.Motherboard;
import behavioral.visitor.element.Hdd;

public interface ComputerPartVisitor {

    void visit(Computer computer);

    void visit(Cpu cpu);

    void visit(Dram dram);

    void visit(Motherboard motherboard);

    void visit(Hdd hdd);

}