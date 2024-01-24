package Vehicles;

import Workshop.*;

public class Bike extends Vehicle{
    public Bike(Workshop w1, Workshop w2) {
        super(w1, w2);
    }

    @Override
    public void manufecture() {
            System.out.println("Bike: " + produce.work() +" and " + assemble.work());
    }
}
