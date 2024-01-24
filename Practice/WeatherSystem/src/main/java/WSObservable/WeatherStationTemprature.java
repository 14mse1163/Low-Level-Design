package WSObservable;

import WSObservers.Displays;

public class WeatherStationTemprature extends  WeatherStation{

    private int temprature = 0;

    public void setTemprature(int  newTemp) {
        temprature = newTemp;
        notifyDisplays();
    }

    public int getTemprature() {
        return temprature;
    }
}
