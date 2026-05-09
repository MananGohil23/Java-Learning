import java.io.*;

class CheckedExceptions {
    public static void main(String[] args) {
        // i-a. ClassNotFoundException
        System.out.println("=== ClassNotFoundException Demo ===");
        try {
            Class<?> cls = Class.forName("com.nonexistent.MyClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
        }

        // i-b. IOException using BufferedReader
        System.out.println("\n=== IOException Demo (using BufferedReader) ===");
        try {
            BufferedReader br = new BufferedReader(new FileReader("nonexistent_file.txt"));
            String line = br.readLine();
            br.close();
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }

        // Reading input using BufferedReader
        System.out.println("\n=== Reading Input using BufferedReader ===");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your name: ");
            String name = br.readLine();
            System.out.println("Hello, " + name + "!");
        } catch (IOException e) {
            System.out.println("IOException caught while reading input: " + e.getMessage());
        }
    }
}
