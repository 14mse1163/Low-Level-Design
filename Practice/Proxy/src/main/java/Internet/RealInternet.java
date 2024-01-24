package Internet;

import java.util.ArrayList;

public class RealInternet extends   Internet{
    @Override
    public void connectTo(String site) throws Exception {
        System.out.println("Connected to" +site);
    }
}
