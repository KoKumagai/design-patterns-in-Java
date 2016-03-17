package behavioral.visitor.element;

import behavioral.visitor.visitor.ComputerPartVisitor;

public class Dram extends ComputerPart {

    public Dram(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}