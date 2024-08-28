package pe.com.jtdev.designpatterns.factorymethod.bookexample.ingredients.impl.chicago;

import pe.com.jtdev.designpatterns.factorymethod.bookexample.ingredients.Dough;

public class ChicagoDough implements Dough {
    public ChicagoDough() {
        System.out.println("[It is ChicagoDough...]");
    }
}
