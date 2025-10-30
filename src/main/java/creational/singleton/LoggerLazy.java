package creational.singleton;

public class LoggerLazy {

    private static LoggerLazy instance;

    private LoggerLazy(){
    }

    public static LoggerLazy getInstance(){
        if (instance == null){
            instance = new LoggerLazy();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
