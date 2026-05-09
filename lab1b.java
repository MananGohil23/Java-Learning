import java.util.*;
class ifelse{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers :");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if(num1 > num2)
        {
            if(num1 > num3)
            {
                System.out.println("The highest number is : " + num1);
            }
            else
            {
                System.out.println("The highest number is : " + num3);
            }
        }
        else if(num2 > num3)
        {
            System.out.println("The highest number is : "+num2);
        }
        else
        {
            System.out.println("The highest number is : "+num3);
        }
    }
}

class ternary{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        String result = (num1>num2)?((num1>num3)?"The highest number is : "+num1:"The highest number is : "+num3):(num2>num3?"The highest number is : "+num2:"The highest number is : "+num3);
        System.out.println(result);
    }
}