import java.util.*;
class jaggedpattern{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int i,j;
        System.out.println("Enter the number of rows:");
        int rows = scan.nextInt();
        int arr[][] = new int[rows][];
        for(i=0;i<rows;i++)
        {
            arr[i] = new int[i+1];
        }
        for(i=0;i<rows;i++)
        {
            for(j=0;j<=i;j++)
            {
                arr[i][j] = j+1;
            }
        }
        System.out.println("Pattern is :");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }
}