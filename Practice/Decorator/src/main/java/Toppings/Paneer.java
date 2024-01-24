package Toppings;

import Pizzas.Pizza;

public class Paneer extends Topping{

    public Paneer(Pizza pizza) {
        super(pizza);
    }
    @Override
    public int getCost() {
        return 50 + pizza.getCost();
    }
}
