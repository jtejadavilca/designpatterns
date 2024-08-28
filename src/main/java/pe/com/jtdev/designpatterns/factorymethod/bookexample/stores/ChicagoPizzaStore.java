package pe.com.jtdev.designpatterns.factorymethod.bookexample.stores;

import pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas.Pizza;
import pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas.chicago.ChicagoStyleCheesePizza;
import pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas.chicago.ChicagoStyleClamPizza;
import pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas.chicago.ChicagoStylePepperoniPizza;
import pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas.chicago.ChicagoStyleVeggiePizza;

import java.util.Map;
import java.util.function.Supplier;

public class ChicagoPizzaStore extends PizzaStore {

    static Map<PizzaTypeEnum, Supplier<Pizza>> chicagoCreator = Map.of(
            PizzaTypeEnum.CHEESE, ChicagoStyleCheesePizza::new,
            PizzaTypeEnum.CLAM, ChicagoStyleClamPizza::new,
            PizzaTypeEnum.PEPPERONI, ChicagoStylePepperoniPizza::new,
            PizzaTypeEnum.VEGGIE, ChicagoStyleVeggiePizza::new
    );
    @Override
    protected Pizza createPizza(PizzaTypeEnum type) {
        return chicagoCreator.get(type).get();
    }
}
