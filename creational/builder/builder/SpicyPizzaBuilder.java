package creational.builder.builder;

import creational.builder.pizza.SpicyPizza;

public class SpicyPizzaBuilder implements PizzaBuilder {

    private SpicyPizza pizza = new SpicyPizza();

    @Override
    public SpicyPizza getPizza() {
        return pizza;
    }

    @Override
    public void preparePizza() {
        pizza.setDough("pan baked");
        pizza.setSauce("hot");
        pizza.setTopping("pepperoni");
        pizza.setCoupon("50 percent off");
    }

}
