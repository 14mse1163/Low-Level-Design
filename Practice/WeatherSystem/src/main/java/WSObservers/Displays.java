package WSObservers;

import WSObservable.WeatherStation;

public abstract class Displays {
    WeatherStation weatherStation;


    public abstract void update();
}
