package pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas;


import pe.com.jtdev.designpatterns.factorymethod.bookexample.ingredients.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected String name;
    protected PizzaIngredientFactory ingredientFactory;

    public Pizza(String name, PizzaIngredientFactory ingredientFactory) {
        this.name = name;
        this.ingredientFactory = ingredientFactory;
    }

    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
