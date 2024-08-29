package pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas;

import pe.com.jtdev.designpatterns.factorymethod.bookexample.ingredients.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza(String name, PizzaIngredientFactory ingredientFactory) {
        super(name, ingredientFactory);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing  " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
