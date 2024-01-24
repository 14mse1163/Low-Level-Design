package Birds;

import Strategies.FlyStrategy;

public class Hen extends Birds{

    public Hen(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public void fly() {
        this.flyStrategy.fly();
    }
}
