package structural.bridge;

public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void power();
    public abstract void volume(int volume);
}

class BasicRemote extends RemoteControl {
    private boolean isOn = false;

    public BasicRemote(Device device){
        super(device);
    }

    @Override
    public void power() {
        if (isOn){
            device.turnOff();
        } else {
            device.turnOn();
        }
    }

    @Override
    public void volume(int volume) {
        device.setVolume(volume);
    }
}