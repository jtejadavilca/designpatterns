package pe.com.jtdev.designpatterns.factorymethod.bookexample.ingredients.impl.chicago;

import pe.com.jtdev.designpatterns.factorymethod.bookexample.ingredients.Cheese;

public class ChicagoCheese implements Cheese {
    public ChicagoCheese() {
        System.out.println("[It is ChicagoCheese...]");
    }
}
