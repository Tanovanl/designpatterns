package behavioural.observer;

public class PhoneDisplay implements Observer{
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("[PHONEDISPLAY]: The new temperature is: " + temperature + " and the humidity is: " + humidity);
    }
}
