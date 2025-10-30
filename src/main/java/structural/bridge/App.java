package structural.bridge;

public class App {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        RemoteControl tvRemote = new BasicRemote(tv);
        RemoteControl radioRemote = new BasicRemote(radio);

        tvRemote.power();       // TV turned ON
        tvRemote.volume(30);    // TV volume set to 30%

        radioRemote.power();    // Radio turned ON
        radioRemote.volume(70); // Radio volume set to 70%
    }
}
