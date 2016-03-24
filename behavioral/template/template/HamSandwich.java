package behavioral.template.template;

public class HamSandwich extends Sandwich {

    @Override
    void chooseBread() {
        System.out.println("Bread: Italian");
    }

    @Override
    void spreadFilling() {
        System.out.println("Filling: Butter");
    }

    @Override
    void putCondiment() {
        System.out.println("Condiment: Ham");
    }

}