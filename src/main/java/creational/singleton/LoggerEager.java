package creational.singleton;

public class LoggerEager {

    private static final LoggerEager instance = new LoggerEager();

    private LoggerEager(){
        System.out.println("Logger aangemaakt");
    }

    public static LoggerEager getInstance(){
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
