package behavioral.visitor.element;

import behavioral.visitor.visitor.ComputerPartVisitor;

public class Motherboard extends ComputerPart {

    public Motherboard(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}