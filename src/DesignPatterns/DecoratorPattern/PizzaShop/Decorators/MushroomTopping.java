package DesignPatterns.DecoratorPattern.PizzaShop.Decorators;

import DesignPatterns.DecoratorPattern.PizzaShop.Base.BasePizza;

public class MushroomTopping extends ToppingDecorator {

    private BasePizza basePizza;

    public MushroomTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }
}
