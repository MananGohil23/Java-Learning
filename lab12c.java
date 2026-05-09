import java.io.*;

// Custom exception for division by zero
class DivisionByZeroException extends Exception {
    public DivisionByZeroException() {
        super("Custom Exception: Divisor cannot be zero! Division is undefined.");
    }
}
class DivisionWithExceptions {

    // Method to perform division; throws custom exception if divisor is zero
    static double divide(double dividend, double divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException();
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        DataInputStream dis = new DataInputStream(System.in);
        double num1 = 0, num2 = 0;

        System.out.println("===== Division Program with Exception Handling =====\n");

        try {
            // Accept two numbers from user
            System.out.print("Enter the dividend (first number) : ");
            num1 = Double.parseDouble(dis.readLine());

            System.out.print("Enter the divisor  (second number): ");
            num2 = Double.parseDouble(dis.readLine());

            // Throws DivisionByZeroException if divisor is zero
            double result = divide(num1, num2);

            System.out.println("\nResult: " + num1 + " / " + num2 + " = " + result);

        } catch (DivisionByZeroException e) {
            // Handles the custom exception when divisor is zero
            System.out.println("\n[DivisionByZeroException] " + e.getMessage());

        } catch (ArithmeticException e) {
            // Handles arithmetic exceptions
            System.out.println("\n[ArithmeticException] " + e.getMessage());

        } catch (NumberFormatException e) {
            // Handles invalid numeric input
            System.out.println("\n[NumberFormatException] Invalid input. Please enter valid numbers.");

        } catch (IOException e) {
            // Handles I/O errors from DataInputStream
            System.out.println("\n[IOException] Error reading input: " + e.getMessage());

        } finally {
            // Always executes — termination message
            System.out.println("\n-------------------------------------------------");
            System.out.println("  Program terminated. Thank you for using the     ");
            System.out.println("  Division Program. [finally block executed]       ");
            System.out.println("-------------------------------------------------");
        }
    }
}
