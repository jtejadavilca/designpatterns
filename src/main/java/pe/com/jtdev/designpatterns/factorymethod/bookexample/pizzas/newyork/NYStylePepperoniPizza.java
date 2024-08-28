package pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas.newyork;

import pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas.Pizza;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {

        name = "NY Style Pepperoni Pizza";
        dough = "Dough for NY Pepperoni pizza";
        sauce = "Sauce for NY Pepperoni pizza";

        toppings.add("Grated Something NY Pepperoni Topping");
    }
}
