import java.util.*;
class pattern{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int rows = scn.nextInt();
		int i,j,k;
		for(i=0;i<rows;i++)
		{
			if(i%2==0)
			{
				for(j=i;j>0;j--)
				{
					System.out.print(j);
				}
			}
			else
			{
				for(k=1;k<=i;k++)
				{
					System.out.print(k);
				}
			}
			System.out.println("");
		}
	}
}

class pattern2
{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        int i,j,k;
        System.out.println("Please enter number of rows");
        int n=s.nextInt();
        char ch='A';
        for (i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            char t=(char)(ch+i-1);
            for(j=1;j<=i;j++)
            {
                System.out.print(t);
                t--;
            }
            System.out.print("\n");
            ch=(char)(ch+i);
        }
    }
}
