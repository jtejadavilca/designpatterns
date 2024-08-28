package pe.com.jtdev.designpatterns.decorator.bookexample;

import pe.com.jtdev.designpatterns.decorator.bookexample.coffees.DarkRoast;
import pe.com.jtdev.designpatterns.decorator.bookexample.coffees.Espresso;
import pe.com.jtdev.designpatterns.decorator.bookexample.coffees.HouseBlend;
import pe.com.jtdev.designpatterns.decorator.bookexample.condiments.Mocha;
import pe.com.jtdev.designpatterns.decorator.bookexample.condiments.Soy;
import pe.com.jtdev.designpatterns.decorator.bookexample.condiments.Whip;

public class DecoratorPattern {

    /**
     * Starbuzz Coffee
     * ---------------
     *
     * Coffees:
     * - House Blend    .89
     * - Dark Roast     .99
     * - Decaf         1.05
     *
     * Condiments:
     * - Steamed Milk   .10
     * - Mocha          .20
     * - Soy            .15
     * - Whip           .10
     *
     */


    public static void main(String[] args) {
        Beverage beverage = new Espresso(Beverage.Size.GRANDE);

        System.out.println("---------------------------------------------");
        System.out.println("----------------Beverage 1--------------------");
        printTotal(beverage);

        System.out.println("---------------------------------------------");
        System.out.println("----------------Beverage 2--------------------");
        Beverage beverage2 = new DarkRoast(Beverage.Size.GRANDE);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        printTotal(beverage2);

        System.out.println("---------------------------------------------");
        System.out.println("----------------Beverage 3--------------------");
        Beverage beverage3 = new HouseBlend(Beverage.Size.VENTI);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        printTotal(beverage3);

    }

    private static void printTotal(Beverage beverage) {
        System.out.println(
                "Beverage 1: "
                        + beverage.getDescription()
                        + " TOTAL= $"
                        + beverage.cost()
        );
    }
}
