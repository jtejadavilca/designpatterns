package pe.com.jtdev.designpatterns.factorymethod.bookexample.ingredients.impl.newyork;

import pe.com.jtdev.designpatterns.factorymethod.bookexample.ingredients.Pepperoni;

public class NYPepperoni implements Pepperoni {
    public NYPepperoni() {
        System.out.println("[It is NYPepperoni...]");
    }
}
