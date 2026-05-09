import java.util.*;
class countstr{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scan.nextLine();
        int spaces=0 , uppers=0 , lowers=0, digits=0;
        int i;
        for(i=0;i<text.length();i++)
        {
            char ch = text.charAt(i);
            if('A'<=ch && ch<='Z')
            {
                uppers++;
            }
            if('a'<=ch && ch<='z')
            {
                lowers++;
            }
            if('0'<=ch && ch<='9')
            {
                digits++;
            }
            if(ch == ' ')
            {
                spaces++;
            }
        }
        System.out.println("The number of spaces : " +spaces);
        System.out.println("The number of uppercase characters : " +uppers);
        System.out.println("The number of lowercase characters : " +lowers);
        System.out.println("The number of digits : " +digits);
    }
}
