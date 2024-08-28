package pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas.chicago;

import pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = "Dough for Chicago Clam pizza";
        sauce = "Sauce for Chicago Clam pizza";

        toppings.add("Grated Something Chicago Clam Topping");
    }
}
