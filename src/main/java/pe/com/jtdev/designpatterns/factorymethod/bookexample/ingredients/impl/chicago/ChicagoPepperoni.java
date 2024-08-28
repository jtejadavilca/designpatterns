package pe.com.jtdev.designpatterns.factorymethod.bookexample.ingredients.impl.chicago;

import pe.com.jtdev.designpatterns.factorymethod.bookexample.ingredients.Pepperoni;

public class ChicagoPepperoni implements Pepperoni {
    public ChicagoPepperoni() {
        System.out.println("[It is ChicagoPepperoni...]");
    }
}
