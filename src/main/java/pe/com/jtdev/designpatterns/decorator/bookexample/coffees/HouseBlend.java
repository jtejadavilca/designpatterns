package pe.com.jtdev.designpatterns.decorator.bookexample.coffees;

import pe.com.jtdev.designpatterns.decorator.bookexample.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(Size size) {
        this.setDescription("House Blend Coffee (" + size.name() + ")");
        this.setSize(size);
    }

    @Override
    public double baseCost() {
        return .89;
    }
}
