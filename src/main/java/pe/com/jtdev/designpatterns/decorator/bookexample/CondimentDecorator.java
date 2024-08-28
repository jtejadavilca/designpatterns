package pe.com.jtdev.designpatterns.decorator.bookexample;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public abstract String getDescription();


    @Override
    public double cost() {
        return beverage.cost() + beverage.accordingSize() * baseCost();
    }
}
