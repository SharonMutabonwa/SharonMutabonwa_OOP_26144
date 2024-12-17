// Main class demonstrating exception handling using OOP principles
public class MainException {

    public static void main(String[] args) {
        // Instantiate handlers for checked and unchecked exceptions
        CheckedExceptionHandler checkedHandler = new CheckedExceptionHandler();
        UncheckedExceptionHandler uncheckedHandler = new UncheckedExceptionHandler();

        // Handle checked exceptions
        System.out.println("Handling Checked Exceptions:");
        checkedHandler.handleIOException();
        checkedHandler.handleFileNotFoundException();
        checkedHandler.handleEOFException();
        checkedHandler.handleSQLException();
        checkedHandler.handleClassNotFoundException();

        System.out.println("\nHandling Unchecked Exceptions:");
        // Handle unchecked exceptions
        uncheckedHandler.handleArithmeticException();
        uncheckedHandler.handleNullPointerException();
        uncheckedHandler.handleArrayIndexOutOfBoundsException();
        uncheckedHandler.handleClassCastException();
        uncheckedHandler.handleIllegalArgumentException();
        uncheckedHandler.handleNumberFormatException();
    }
}
