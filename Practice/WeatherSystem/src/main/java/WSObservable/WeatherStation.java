package WSObservable;

import WSObservers.Displays;

import java.util.ArrayList;
import java.util.List;

public abstract class WeatherStation {
    List<Displays> displays = new ArrayList<Displays>();

    public abstract void setTemprature(int temprature);

    public abstract int getTemprature();
    public void addDisplay(Displays display) {
        displays.add(display);
    }

    public void removeDisplay(Displays display) {
        displays.remove(display);
    }

    public void notifyDisplays(){

        for(Displays display : displays) {
            display.update();
        }
    }
}
