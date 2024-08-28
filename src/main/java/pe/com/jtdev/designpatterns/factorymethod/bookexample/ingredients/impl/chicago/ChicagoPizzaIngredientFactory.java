package pe.com.jtdev.designpatterns.factorymethod.bookexample.ingredients.impl.chicago;

import pe.com.jtdev.designpatterns.factorymethod.bookexample.ingredients.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ChicagoDough();
    }

    @Override
    public Sauce createSauce() {
        return new ChicagoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ChicagoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{
                new ChicagoVeggieGarlic(),
                new ChicagoVeggieMushroom(),
                new ChicagoVeggieOnion(),
                new ChicagoVeggieRedPepper()
        };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new ChicagoPepperoni();
    }

    @Override
    public Clams createClam() {
        return new ChicagoClams();
    }
}
