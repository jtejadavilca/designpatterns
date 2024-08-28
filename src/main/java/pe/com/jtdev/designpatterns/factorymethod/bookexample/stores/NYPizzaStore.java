package pe.com.jtdev.designpatterns.factorymethod.bookexample.stores;

import pe.com.jtdev.designpatterns.factorymethod.bookexample.ingredients.PizzaIngredientFactory;
import pe.com.jtdev.designpatterns.factorymethod.bookexample.ingredients.impl.newyork.NYPizzaIngredientFactory;
import pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas.newyork.NYStyleVeggiePizza;
import pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas.newyork.NYStyleCheesePizza;
import pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas.Pizza;
import pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas.newyork.NYStyleClamPizza;
import pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas.newyork.NYStylePepperoniPizza;

import java.util.Map;
import java.util.function.Supplier;

public class NYPizzaStore extends PizzaStore {
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    static Map<PizzaTypeEnum, Supplier<Pizza>> nyCreator = Map.of(
            PizzaTypeEnum.CHEESE, NYStyleCheesePizza::new,
            PizzaTypeEnum.CLAM, NYStyleClamPizza::new,
            PizzaTypeEnum.PEPPERONI, NYStylePepperoniPizza::new,
            PizzaTypeEnum.VEGGIE, NYStyleVeggiePizza::new
    );

    @Override
    protected Pizza createPizza(PizzaTypeEnum type) {
        return nyCreator.get(type).get();
    }
}
