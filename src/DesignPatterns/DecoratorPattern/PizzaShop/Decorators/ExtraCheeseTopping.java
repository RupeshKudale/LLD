package DesignPatterns.DecoratorPattern.PizzaShop.Decorators;

import DesignPatterns.DecoratorPattern.PizzaShop.Base.BasePizza;

public class ExtraCheeseTopping extends ToppingDecorator{

    private BasePizza basePizza;

    public ExtraCheeseTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    public int cost() {
        return this.basePizza.cost() + 10 ;
    }
}
