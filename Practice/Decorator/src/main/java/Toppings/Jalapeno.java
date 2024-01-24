package Toppings;

import Pizzas.Pizza;

public class Jalapeno extends  Topping{
    public Jalapeno(Pizza pizza) {
        super(pizza);
    }
    @Override
    public int getCost() {
        return 40 + pizza.getCost();
    }
}
