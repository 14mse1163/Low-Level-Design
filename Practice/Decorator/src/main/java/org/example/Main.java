package org.example;

import Pizzas.FarmHouse;
import Pizzas.Pizza;
import Toppings.FreshTomato;
import Toppings.Paneer;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new FarmHouse();

        pizza = new Paneer(new FreshTomato(pizza));

        System.out.println(pizza.getCost());

    }
}