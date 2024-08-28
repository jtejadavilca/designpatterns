package pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas.newyork;

import pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas.Pizza;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {

        name = "NY Style Veggie Pizza";
        dough = "Dough for NY Veggie pizza";
        sauce = "Sauce for NY Veggie pizza";

        toppings.add("Grated Something NY Veggie Topping");
    }


}
