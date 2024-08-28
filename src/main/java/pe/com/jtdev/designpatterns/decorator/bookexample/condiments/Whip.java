package pe.com.jtdev.designpatterns.decorator.bookexample.condiments;

import pe.com.jtdev.designpatterns.decorator.bookexample.Beverage;
import pe.com.jtdev.designpatterns.decorator.bookexample.CondimentDecorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.setSize(beverage.getSize());
        this.beverage = beverage;
    }


    public double baseCost() {
        return .10;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }
}
