package creational.builder;

import creational.builder.builder.PizzaBuilder;
import creational.builder.pizza.Pizza;

public class Waiter {

    public Pizza makePizza(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.preparePizza();
        return pizzaBuilder.getPizza();
    }

}