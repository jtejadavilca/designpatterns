package pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas;

import pe.com.jtdev.designpatterns.factorymethod.bookexample.ingredients.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
    public VeggiePizza(String name, PizzaIngredientFactory ingredientFactory) {
        super(name, ingredientFactory);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing  " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        veggies = ingredientFactory.createVeggies();
    }
}
