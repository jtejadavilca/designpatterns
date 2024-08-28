package pe.com.jtdev.designpatterns.factorymethod.bookexample.ingredients.impl.newyork;

import pe.com.jtdev.designpatterns.factorymethod.bookexample.ingredients.Cheese;

public class NYCheese implements Cheese {
    public NYCheese() {
        System.out.println("[It is NYCheese...]");
    }
}
