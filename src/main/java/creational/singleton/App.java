package creational.singleton;

public class App {
    public static void main(String[] args) {

        LoggerEager logger1 = LoggerEager.getInstance();
        LoggerEager logger2 = LoggerEager.getInstance();

        logger1.log("Starting application...");
        logger2.log("Application is running.");

        System.out.println(logger1 == logger2);

        LoggerLazy lazy = LoggerLazy.getInstance();
        LoggerLazy lazy2 = LoggerLazy.getInstance();

        lazy.log("Starting application...");
        lazy2.log("Application is running.");

        System.out.println(lazy2 == lazy);
    }
}
