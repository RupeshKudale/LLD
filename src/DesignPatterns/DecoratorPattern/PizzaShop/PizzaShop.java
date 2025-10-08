package DesignPatterns.DecoratorPattern.PizzaShop;

import DesignPatterns.DecoratorPattern.PizzaShop.Base.BasePizza;
import DesignPatterns.DecoratorPattern.PizzaShop.Base.FarmersBase;
import DesignPatterns.DecoratorPattern.PizzaShop.Decorators.MushroomTopping;

public class PizzaShop {

    public static void main(String[] args) {
        BasePizza basePizza = new MushroomTopping(new FarmersBase());
        System.out.println(basePizza.cost());
    }
}
