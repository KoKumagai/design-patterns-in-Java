package behavioral.visitor.element;

import behavioral.visitor.visitor.ComputerPartVisitor;

public class Hdd extends ComputerPart {

    public Hdd(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}