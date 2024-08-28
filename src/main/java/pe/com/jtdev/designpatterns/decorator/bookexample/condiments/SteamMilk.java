package pe.com.jtdev.designpatterns.decorator.bookexample.condiments;

import pe.com.jtdev.designpatterns.decorator.bookexample.Beverage;
import pe.com.jtdev.designpatterns.decorator.bookexample.CondimentDecorator;

public class SteamMilk extends CondimentDecorator {

    public SteamMilk(Beverage beverage) {
        this.setSize(beverage.getSize());
        this.beverage = beverage;
    }

    public double baseCost() {
        return .10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steam Milk";
    }
}
