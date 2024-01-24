package Birds;

import Strategies.FlyStrategy;

public abstract class Birds {
    private String name;

    FlyStrategy flyStrategy;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return  name;
    }

    public abstract void fly();
}
