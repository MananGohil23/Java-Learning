import java.util.*;
class sumarr{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int i;
        int arr[] = new int[n];
        System.out.println("Enter the elements into the array:");
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for(i=0;i<n;i++)
        {
            sum = sum+arr[i];
        }
        int arr2[] = new int[n];
        for(i=0;i<n;i++)
        {
            arr2[i] = sum - arr[i];
        }
        System.out.println("New array is:");
        for(i=0;i<n;i++)
        {
            System.out.print(arr2[i] + " ");
        }
        
    }
}
