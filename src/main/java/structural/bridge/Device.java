package structural.bridge;

public interface Device {

    void turnOn();
    void turnOff();
    void setVolume(int percent);

}

class TV implements Device {
    public void turnOn() { System.out.println("TV turned ON"); }
    public void turnOff() { System.out.println("TV turned OFF"); }
    public void setVolume(int percent) { System.out.println("TV volume set to " + percent + "%"); }
}

class Radio implements Device {
    public void turnOn() { System.out.println("Radio turned ON"); }
    public void turnOff() { System.out.println("Radio turned OFF"); }
    public void setVolume(int percent) { System.out.println("Radio volume set to " + percent + "%"); }
}