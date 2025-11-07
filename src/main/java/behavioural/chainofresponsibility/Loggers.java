package behavioural.chainofresponsibility;

class InfoLogger extends Logger {
    public InfoLogger() {
        this.level = Logger.INFO;
    }

    @Override
    protected void write(String message) {
        System.out.println("INFO: " + message);
    }
}

class DebugLogger extends Logger {
    public DebugLogger() {
        this.level = Logger.DEBUG;
    }

    @Override
    protected void write(String message) {
        System.out.println("DEBUG: " + message);
    }
}

class ErrorLogger extends Logger {
    public ErrorLogger() {
        this.level = Logger.ERROR;
    }

    @Override
    protected void write(String message) {
        System.out.println("ERROR: " + message);
    }
}

