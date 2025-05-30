
// Exception Handling Example
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e);
        } finally {
            System.out.println("Finally block always runs.");
        }
    }
}
