package pe.com.jtdev.designpatterns.factorymethod.bookexample.stores;

import pe.com.jtdev.designpatterns.factorymethod.bookexample.ingredients.PizzaIngredientFactory;
import pe.com.jtdev.designpatterns.factorymethod.bookexample.ingredients.impl.newyork.NYPizzaIngredientFactory;
import pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas.*;

import java.util.Map;
import java.util.function.Supplier;

public class NYPizzaStore extends PizzaStore {
    static PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    static Map<PizzaTypeEnum, Supplier<Pizza>> nyCreator = Map.of(
            PizzaTypeEnum.CHEESE, () -> new CheesePizza("NY Style Sauce and Cheese Pizza", ingredientFactory),
            PizzaTypeEnum.CLAM, () -> new ClamPizza("NY Style Clam Pizza", ingredientFactory),
            PizzaTypeEnum.PEPPERONI, () -> new PepperoniPizza("NY Style Pepperoni Pizza", ingredientFactory),
            PizzaTypeEnum.VEGGIE, () -> new VeggiePizza("NY Style Veggie Pizza", ingredientFactory)
    );

    @Override
    protected Pizza createPizza(PizzaTypeEnum type) {
        return nyCreator.get(type).get();
    }
}
