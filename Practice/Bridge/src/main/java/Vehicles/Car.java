package Vehicles;
import Workshop.*;

public class Car  extends Vehicle
{
    public Car(Workshop w1, Workshop w2) {
        super(w1, w2);
    }

    @Override
    public void manufecture() {
        System.out.println("Car: " + produce.work() +" and " + assemble.work());
    }
}
