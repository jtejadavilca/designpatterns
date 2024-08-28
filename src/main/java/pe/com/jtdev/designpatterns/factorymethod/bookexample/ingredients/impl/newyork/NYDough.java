package pe.com.jtdev.designpatterns.factorymethod.bookexample.ingredients.impl.newyork;

import pe.com.jtdev.designpatterns.factorymethod.bookexample.ingredients.Dough;

public class NYDough implements Dough {
    public NYDough() {
        System.out.println("[It is NYDough...]");
    }
}
