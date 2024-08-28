package pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas.chicago;

import pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Dough for Chicago Pepperoni pizza";
        sauce = "Sauce for Chicago Pepperoni pizza";

        toppings.add("Grated Something Chicago Pepperoni Topping");
    }
}
