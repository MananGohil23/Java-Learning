import java.util.*;
class lab1a{
    public static void main(String args[])
    {
            Scanner scan = new Scanner(System.in);
            int n;
            System.out.println("Enter a number :");
            n = scan.nextInt();
            if(n%2==0)
            {
                if(2<=n && n<=5)
                {
                    System.out.println("Not Weird");
                }
                else if(6<=n && n<=20)
                {
                    System.out.println("Weird");
                }
                else if(20<n)
                {
                    System.out.println("Not Weird");
                }
            }
            else
            {
                System.out.println("Weird");
            }
    }
}