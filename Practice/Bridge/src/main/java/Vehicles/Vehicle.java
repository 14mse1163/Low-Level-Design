package Vehicles;

import Workshop.Workshop;

public abstract class Vehicle
{
    protected Workshop produce , assemble;
    public Vehicle(Workshop w1 , Workshop w2) {
        this. produce = w1;
        this.assemble = w2;
    }

    public abstract void manufecture();
}
