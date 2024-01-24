package Toppings;

import Pizzas.Pizza;

public class FreshTomato extends Topping{

    public FreshTomato(Pizza pizza) {
        super(pizza);
    }
    @Override
    public int getCost() {
        return 40 + pizza.getCost();
    }
}
