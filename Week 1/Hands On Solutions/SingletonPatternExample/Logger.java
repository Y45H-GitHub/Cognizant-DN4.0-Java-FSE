public class Logger{

    private static Logger instance;

    private Logger() {
        System.out.println("=== CREATED LOGGER CLASS INSTANCE ===");
    }

    public static Logger getInstance() {
        if (instance==null) {
            instance=new Logger();
        }
        return instance;
    }

    public void test(String msg) {
        System.out.println("TESTING:  " + msg);
    }

}