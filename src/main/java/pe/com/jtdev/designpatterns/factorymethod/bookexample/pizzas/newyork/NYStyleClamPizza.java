package pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas.newyork;

import pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas.Pizza;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        name = "NY Style Clam Pizza";
        dough = "Dough for NY Clam pizza";
        sauce = "Sauce for NY Clam pizza";

        toppings.add("Grated Something NY Clam Topping");
    }
}
