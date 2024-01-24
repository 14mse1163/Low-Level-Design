import WSObservable.WeatherStation;
import WSObservable.WeatherStationTemprature;
import WSObservers.Displays;
import WSObservers.MobileDisplay;
import WSObservers.TVDisplay;

public class WeatherSystemDemo {
    public static void main(String[] args) {

        WeatherStation ws = new WeatherStationTemprature();
        Displays tv = new TVDisplay(ws);
        Displays mobile = new MobileDisplay(ws);


        ws.setTemprature(2);

        ws.removeDisplay(tv);

        ws.setTemprature(3);

    }
}
