package Toppings;

import Pizzas.Pizza;

public class Barbeque extends Topping{

    public Barbeque(Pizza pizza) {
        super(pizza);
    }
    @Override
    public int getCost() {
        return 20 + pizza.getCost();
    }
}
