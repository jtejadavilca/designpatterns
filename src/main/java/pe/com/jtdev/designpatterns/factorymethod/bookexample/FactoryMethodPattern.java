package pe.com.jtdev.designpatterns.factorymethod.bookexample;

import pe.com.jtdev.designpatterns.factorymethod.bookexample.pizzas.Pizza;
import pe.com.jtdev.designpatterns.factorymethod.bookexample.stores.ChicagoPizzaStore;
import pe.com.jtdev.designpatterns.factorymethod.bookexample.stores.NYPizzaStore;
import pe.com.jtdev.designpatterns.factorymethod.bookexample.stores.PizzaStore;
import pe.com.jtdev.designpatterns.factorymethod.bookexample.stores.PizzaTypeEnum;

public class FactoryMethodPattern {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(PizzaTypeEnum.CHEESE);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza(PizzaTypeEnum.VEGGIE);
        System.out.println("Ethan's brother ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(PizzaTypeEnum.CHEESE);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(PizzaTypeEnum.VEGGIE);
        System.out.println("Joel's brother ordered a " + pizza.getName() + "\n");
    }
}
