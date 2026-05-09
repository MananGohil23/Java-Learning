import java.util.*;
class series
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        int i;	
        float sum=0;	
        System.out.println("Please enter an integer :");
        int n=scan.nextInt();
        for (i=1;i<=n;i++)
        {
            sum+=1.0/(i*i);
        }
        System.out.println("The sum of the series till "+n+" is "+sum+".");
    }
}
