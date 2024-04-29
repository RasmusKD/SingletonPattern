public class Main {
    public static void main(String[] args) {
        // Getting the first instance of Logger
        Logger logger1 = Logger.getInstance();
        // Getting another instance of Logger
        Logger logger2 = Logger.getInstance();
        // Demonstrating logging
        logger1.log("This is a log message from logger1.");
        logger2.log("This is another log message from the same instance.");
    }
}
