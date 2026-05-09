import java.util.*;
class strmethods{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text :");
        String text = scan.nextLine();
        int length = text.length();
        System.out.println("Length of the string is : "+length);
        String uppercaseString = text.toUpperCase();
        System.out.println("Uppercased string : "+ uppercaseString);
        String concatenatedString = text.concat(" concatenated string");
        System.out.println("After concatenation : "+concatenatedString);
        System.out.println("Original String : "+text);
    }
}
