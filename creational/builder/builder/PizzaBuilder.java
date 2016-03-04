package creational.builder.builder;

import creational.builder.pizza.Pizza;

public interface PizzaBuilder {

    Pizza getPizza();

    void preparePizza();

}