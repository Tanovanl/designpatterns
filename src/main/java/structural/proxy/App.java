package structural.proxy;

public class App {
    public static void main(String[] args) {
        Image image = new ProxyImage("photo.jpg");

        // Image will be loaded only once
        image.display(); // Loads and displays
        image.display(); // Just displays
    }
}
