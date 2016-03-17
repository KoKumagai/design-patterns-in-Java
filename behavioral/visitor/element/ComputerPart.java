package behavioral.visitor.element;

import behavioral.visitor.visitor.ComputerPartVisitor;

public abstract class ComputerPart {

    private String brand;
    private String model;

    public ComputerPart(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public abstract void accept(ComputerPartVisitor computerPartVisitor);

}