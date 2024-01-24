package WSObservers;

import WSObservable.WeatherStation;

public class TVDisplay extends  Displays{
    public TVDisplay(WeatherStation ws) {
        weatherStation = ws;
        weatherStation.addDisplay(this);
    }
    @Override
    public void update() {
        System.out.println("On TV: " +weatherStation.getTemprature());
    }
}
