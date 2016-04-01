package creational.builder.builder;

import creational.builder.product.Pizza;

public interface PizzaBuilder {

    Pizza getPizza();

    void preparePizza();

}