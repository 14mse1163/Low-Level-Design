package org.example;

import Vehicles.*;
import Workshop.*;

public class Main {
    public static void main(String[] args) {
        Workshop produce = new Produces();
        Workshop assemble = new Assembles();
        Vehicle car = new Car(produce, assemble);
        car.manufecture();

        Vehicle bike = new Bike(produce , assemble);
        bike.manufecture();
    }
}