import java.util.*;
class palindrome{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word :");  
        String original = scan.nextLine();                                     
        StringBuffer sb = new StringBuffer(original);
        String reversedString = sb.reverse().toString();
        if(original.equals(reversedString))
        {
            System.out.println("The given string "+original+" is a palindrome");
        }
        else
        {
            System.out.println("The given string "+original+" is not a palindrome");
        }
    }
}