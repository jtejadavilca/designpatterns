package pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas.chicago;

import pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Veggie Pizza";
        dough = "Dough for Chicago Veggie pizza";
        sauce = "Sauce for Chicago Veggie pizza";

        toppings.add("Grated Something Chicago Veggie Topping");
    }
}
