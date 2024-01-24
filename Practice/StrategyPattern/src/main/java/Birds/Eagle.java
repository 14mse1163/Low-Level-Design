package Birds;

import Strategies.FlyStrategy;

public class Eagle extends Birds{

    public Eagle(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public void fly() {
        flyStrategy.fly();
    }
}
