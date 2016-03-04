package creational.builder;

import creational.builder.builder.ChildPizzaBuilder;
import creational.builder.builder.SpicyPizzaBuilder;
import creational.builder.pizza.ChildPizza;
import creational.builder.pizza.SpicyPizza;

public class Client {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        ChildPizza childPizza = (ChildPizza) waiter.makePizza(new ChildPizzaBuilder());

        System.out.println(childPizza.getClass().getSimpleName()); // ChildPizza
        System.out.println("Dough: " + childPizza.getDough());     // Dough: cross
        System.out.println("Sauce: " + childPizza.getSauce());     // Sauce: mild
        System.out.println("Topping: " + childPizza.getTopping()); // Topping: pineapple
        System.out.println("Toy: " + childPizza.getToy());         // Toy: pikachu figure


        SpicyPizza spicyPizza = (SpicyPizza) waiter.makePizza(new SpicyPizzaBuilder());

        System.out.println(spicyPizza.getClass().getSimpleName()); // SpicyPizza
        System.out.println("Dough: " + spicyPizza.getDough());     // Dough: pan baked
        System.out.println("Sauce: " + spicyPizza.getSauce());     // Sauce: hot
        System.out.println("Topping: " + spicyPizza.getTopping()); // Topping: pepperoni
        System.out.println("Coupon: " + spicyPizza.getCoupon());   // Coupon: 50 percent off
    }

}