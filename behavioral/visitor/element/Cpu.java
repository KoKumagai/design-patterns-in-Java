package behavioral.visitor.element;

import behavioral.visitor.visitor.ComputerPartVisitor;

public class Cpu extends ComputerPart {

    public Cpu(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}