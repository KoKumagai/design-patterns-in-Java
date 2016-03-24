package behavioral.template;

import behavioral.template.template.EggSandwich;
import behavioral.template.template.HamSandwich;
import behavioral.template.template.Sandwich;

public class Client {

    public static void main(String[] args) {
        Sandwich hamSandwich = new HamSandwich();
        hamSandwich.make();
        // Bread: Italian
        // Filling: Butter
        // Condiment: Ham

        Sandwich eggSandwich = new EggSandwich();
        eggSandwich.make();
        // Bread: Flat
        // Filling: Mayonnaise
        // Condiment: Egg
    }

}