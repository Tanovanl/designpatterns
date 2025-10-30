package creational.abstractfactory;

public class App {
    public static void main(String[] args) {
        GUIFactory winFactory = new WindowsFactory();
        GUIFactory webFactory = new WebFactory();


        Application applicationWin = new Application(winFactory);
        Application applicationWeb = new Application(webFactory);

        applicationWin.render();
        applicationWeb.render();
    }
}
