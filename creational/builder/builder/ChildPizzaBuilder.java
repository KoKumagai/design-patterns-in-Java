package creational.builder.builder;

import creational.builder.pizza.ChildPizza;

public class ChildPizzaBuilder implements PizzaBuilder {

    private ChildPizza pizza = new ChildPizza();

    @Override
    public ChildPizza getPizza() {
        return pizza;
    }

    @Override
    public void preparePizza() {
        pizza.setDough("cross");
        pizza.setSauce("mild");
        pizza.setTopping("pineapple");
        pizza.setToy("pikachu figure");
    }

}