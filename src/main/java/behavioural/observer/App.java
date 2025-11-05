package behavioural.observer;

public class App {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay();
        WebDisplay webDisplay = new WebDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(webDisplay);

        weatherStation.setMeasurement(20.5f, 100.0f);
    }
}
