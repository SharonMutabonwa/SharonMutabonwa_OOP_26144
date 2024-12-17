// Class to handle unchecked exceptions
public class UncheckedExceptionHandler {

    // Simulates ArithmeticException
    public void handleArithmeticException() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }

    // Simulates NullPointerException
    public void handleNullPointerException() {
        try {
            String nullString = null;
            System.out.println(nullString.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }

    // Simulates ArrayIndexOutOfBoundsException
    public void handleArrayIndexOutOfBoundsException() {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }

    // Simulates ClassCastException
    public void handleClassCastException() {
        try {
            Object obj = "This is a string";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
        }
    }

    // Simulates IllegalArgumentException
    public void handleIllegalArgumentException() {
        try {
            Thread.sleep(-1000);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught: " + e.getMessage());
        }
    }

    // Simulates NumberFormatException
    public void handleNumberFormatException() {
        try {
            int num = Integer.parseInt("NotANumber");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}
