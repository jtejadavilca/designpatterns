package pe.com.jtdev.designpatterns.decorator.bookexample.condiments;

import pe.com.jtdev.designpatterns.decorator.bookexample.Beverage;
import pe.com.jtdev.designpatterns.decorator.bookexample.CondimentDecorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.setSize(beverage.getSize());
        this.beverage = beverage;
    }

    public double baseCost() {
        return .15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
