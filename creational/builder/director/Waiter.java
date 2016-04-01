package creational.builder.director;

import creational.builder.builder.PizzaBuilder;
import creational.builder.product.Pizza;

public class Waiter {

    public Pizza makePizza(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.preparePizza();
        return pizzaBuilder.getPizza();
    }

}