import java.io.*;

// User-defined Exception class
class MarksOutOfBoundsException extends Exception {
    private int marks;

    public MarksOutOfBoundsException(int marks) {
        super("Marks out of bounds: " + marks + ". Valid range is 0 to 100.");
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}

class MarksOutOfBoundsDemo {

    // Method that validates marks and throws custom exception if invalid
    static void validateMarks(String subject, int marks) throws MarksOutOfBoundsException {
        if (marks > 100 || marks < 0) {
            throw new MarksOutOfBoundsException(marks);
        }
        System.out.println(subject + " marks accepted: " + marks);
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] subjects = {"Maths", "Science", "English"};

        System.out.println("===== Marks Entry System =====");
        System.out.println("Enter marks for each subject (valid range: 0 - 100)\n");

        for (String subject : subjects) {
            try {
                System.out.print("Enter marks for " + subject + ": ");
                int marks = Integer.parseInt(br.readLine());
                validateMarks(subject, marks);
            } catch (MarksOutOfBoundsException e) {
                System.out.println("ERROR - MarksOutOfBoundsException caught!");
                System.out.println("  Message : " + e.getMessage());
                System.out.println("  Entered : " + e.getMarks());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a numeric value.");
            } catch (IOException e) {
                System.out.println("IOException: " + e.getMessage());
            }
            System.out.println();
        }

        System.out.println("===== Marks entry complete =====");
    }
}
