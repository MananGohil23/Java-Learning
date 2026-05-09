import java.util.*;
class students{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int stds[][] = new int[5][3];
        int i,j;
        int total[] = new int[5];
        for(i=0;i<5;i++)
        {
            System.out.println("Enter marks for Roll.no:" + (i+1));
            for(j=0;j<3;j++)
            {
                stds[i][j] = sc.nextInt();
                total[i] += stds[i][j];
            }
        }
        int max = total[0];
        int stdnum = 0;
        for(i=0;i<5;i++)
        {
            if(max<total[i])
            {
                max = total[i];
                stdnum = i+1;
            }
        }
        System.out.println("Roll.no\tTotal");
        for(i=0;i<5;i++)
        {
            System.out.println(""  + (i+1) +"\t"+ total[i]);
        }
        System.out.println("The topper is Roll.no: " + stdnum + " with total of " + max);       
    }
}