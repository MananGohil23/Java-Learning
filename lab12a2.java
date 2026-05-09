import java.io.*;

class UncheckedExceptions {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // ii-a. NumberFormatException
        System.out.println("=== NumberFormatException Demo ===");
        try {
            System.out.print("Enter a number: ");
            String input = br.readLine();
            int num = Integer.parseInt(input);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: \"" + e.getMessage() + "\" is not a valid integer.");
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }

        // ii-b. ArithmeticException
        System.out.println("\n=== ArithmeticException Demo ===");
        try {
            System.out.print("Enter dividend: ");
            int a = Integer.parseInt(br.readLine());
            System.out.print("Enter divisor: ");
            int b = Integer.parseInt(br.readLine());
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }

        // ii-c. ArrayIndexOutOfBoundsException
        System.out.println("\n=== ArrayIndexOutOfBoundsException Demo ===");
        try {
            int[] arr = {10, 20, 30};
            System.out.print("Enter array index to access (array size = 3): ");
            int index = Integer.parseInt(br.readLine());
            System.out.println("Element at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Index " + e.getMessage() + " is out of bounds.");
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }

        // ii-d. NullPointerException
        System.out.println("\n=== NullPointerException Demo ===");
        try {
            String str = null;
            System.out.println("String length: " + str.length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: Cannot call method on a null object reference.");
        }

        System.out.println("\nProgram ended gracefully.");
    }
}
