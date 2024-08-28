package pe.com.jtdev.designpatterns.factorymethod.bookexample.stores;

import pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaTypeEnum type) {
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(PizzaTypeEnum type);
}
