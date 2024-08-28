package pe.com.jtdev.designpatterns.factorymethod.bookexample.ingredients.impl.newyork;

import pe.com.jtdev.designpatterns.factorymethod.bookexample.ingredients.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new NYDough();
    }

    @Override
    public Sauce createSauce() {
        return new NYSauce();
    }

    @Override
    public Cheese createCheese() {
        return new NYCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{
                new NYVeggieGarlic(),
                new NYVeggieMushroom(),
                new NYVeggieOnion(),
                new NYVeggieRedPepper()
        };
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clams createClam() {
        return new NYClams();
    }
}
