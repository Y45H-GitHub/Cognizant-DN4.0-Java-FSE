public class Main {
    public static void main(String[] args) {
        Logger obj1 = Logger.getInstance();
        obj1.test("This is the first test msg.");
        Logger obj2 = Logger.getInstance();
        obj2.test("This is the second test msg.");
        if (obj1 == obj2) {
            System.out.println("Singleton works, both variables contain the same instance.");
        } else {
            System.out.println("Singleton failed, variables contain different instances.");
        }
    }
}
