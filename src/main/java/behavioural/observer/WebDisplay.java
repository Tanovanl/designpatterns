package behavioural.observer;

public class WebDisplay implements Observer{
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("[WEBDISPLAY]: The new temperature is: " + temperature + " and the humidity is: " + humidity);
    }
}
