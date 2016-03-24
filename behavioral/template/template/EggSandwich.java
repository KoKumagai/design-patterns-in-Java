package behavioral.template.template;

public class EggSandwich extends Sandwich {

    @Override
    void chooseBread() {
        System.out.println("Bread: Flat");
    }

    @Override
    void spreadFilling() {
        System.out.println("Filling: Mayonnaise");
    }

    @Override
    void putCondiment() {
        System.out.println("Condiment: Egg");
    }

}