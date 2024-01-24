package Toppings;

import Pizzas.Pizza;

public abstract class Topping extends Pizza {
    protected Pizza pizza ;

    public Topping(Pizza pizza) {
        this.pizza = pizza;
    }

}
