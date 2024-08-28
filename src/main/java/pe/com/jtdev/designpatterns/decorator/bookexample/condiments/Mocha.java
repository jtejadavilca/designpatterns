package pe.com.jtdev.designpatterns.decorator.bookexample.condiments;

import pe.com.jtdev.designpatterns.decorator.bookexample.Beverage;
import pe.com.jtdev.designpatterns.decorator.bookexample.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.setSize(beverage.getSize());
        this.beverage = beverage;
    }

    public double baseCost() {
        return .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
