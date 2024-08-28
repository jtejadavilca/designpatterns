package pe.com.jtdev.designpatterns.decorator.bookexample.coffees;

import pe.com.jtdev.designpatterns.decorator.bookexample.Beverage;

public class Decaf extends Beverage {

    public Decaf(Size size) {
        this.setDescription("Decaf Coffee (" + size.name() + ")");
        this.setSize(size);
    }

    @Override
    public double baseCost() {
        return 1.05;
    }
}
