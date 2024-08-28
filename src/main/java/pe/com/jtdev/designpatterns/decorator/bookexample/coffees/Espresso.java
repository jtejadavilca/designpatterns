package pe.com.jtdev.designpatterns.decorator.bookexample.coffees;

import pe.com.jtdev.designpatterns.decorator.bookexample.Beverage;

public class Espresso extends Beverage {
    public Espresso(Size size) {
        this.setDescription("Espresso (" + size.name() + ")");
        this.setSize(size);
    }

    @Override
    public double baseCost() {
        return 1.99;
    }
}
