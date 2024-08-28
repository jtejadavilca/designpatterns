package pe.com.jtdev.designpatterns.decorator.bookexample.coffees;

import pe.com.jtdev.designpatterns.decorator.bookexample.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(Size size) {
        this.setSize(size);
        this.setDescription("Dark Roast Coffee (" + size.name() + ")");
    }

    @Override
    public double baseCost() {
        return .99;
    }
}
