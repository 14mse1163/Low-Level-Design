package WSObservers;

import WSObservable.WeatherStation;

public class MobileDisplay extends Displays{

    public MobileDisplay(WeatherStation ws) {

        weatherStation = ws;
        weatherStation.addDisplay(this);
    }
    @Override
    public void update() {
        System.out.println("On Mobile : "+ weatherStation.getTemprature());
    }
}
