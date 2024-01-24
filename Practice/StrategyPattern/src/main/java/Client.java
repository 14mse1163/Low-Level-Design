import Birds.*;
import Strategies.HighFly;
import Strategies.LowFly;

public class Client {

    public static  void main(String[] args) {


        Birds eagle = new Eagle(new HighFly());
        Birds hem = new Hen(new LowFly());
        eagle.fly();
        hem.fly();
    }
}
