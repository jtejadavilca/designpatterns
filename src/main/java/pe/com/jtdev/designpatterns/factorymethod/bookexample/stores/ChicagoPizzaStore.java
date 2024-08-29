package pe.com.jtdev.designpatterns.factorymethod.bookexample.stores;

import pe.com.jtdev.designpatterns.factorymethod.bookexample.ingredients.PizzaIngredientFactory;
import pe.com.jtdev.designpatterns.factorymethod.bookexample.ingredients.impl.chicago.ChicagoPizzaIngredientFactory;
import pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas.*;

import java.util.Map;
import java.util.function.Supplier;

public class ChicagoPizzaStore extends PizzaStore {
    static PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

    static Map<PizzaTypeEnum, Supplier<Pizza>> chicagoCreator = Map.of(
            PizzaTypeEnum.CHEESE, () -> new CheesePizza("Chicago Style Deep Dish Cheese Pizza", ingredientFactory),
            PizzaTypeEnum.CLAM, () -> new ClamPizza("Chicago Style Clam Pizza", ingredientFactory),
            PizzaTypeEnum.PEPPERONI, () -> new PepperoniPizza("Chicago Style Pepperoni Pizza", ingredientFactory),
            PizzaTypeEnum.VEGGIE, () -> new VeggiePizza("Chicago Style Veggie Pizza", ingredientFactory)
    );

    @Override
    protected Pizza createPizza(PizzaTypeEnum type) {
        return chicagoCreator.get(type).get();
    }
}
