public class ExceptionTest {
    public static void main(String[] args) {
        try {
            int num = -5;
            if (num < 0) {
                throw new NegativeNumberException("Custom message: Negative numbers are not allowed.");
            }
        } catch (NegativeNumberException e) {
            System.out.println("Caught NegativeNumberException: " + e.getMessage());
        }
    }
}
