import java.util.*;
class swtch{
    public static void main (String args[])
    {
        Scanner scan=new Scanner(System.in);
        float result = 0;
        int flag=0;
        System.out.println("Please enter two numbers :");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        System.out.println("Select a number:\n1:addition\n2:subtraction\n3:multiplication\n4:division\n5:modulus");
        int choice=scan.nextInt();
        switch (choice)
        {
            case 1:	
                result=num1+num2;
                flag = 1;
                break;
            case 2:	
                result=num1-num2;    
                flag = 1;
                break;
            case 3:	
                result=num1*num2;
                flag = 1;
                break;
            case 4:	
                result=num1/num2;
                flag = 1;
                break;
            case 5:	
                result=num1%num2;
                flag = 1;
                break;
            default:
                System.out.println("Invalid Selection");
        }
        if(flag==1)
        {
            System.out.println("The result of the operation is : "+result);	
        }
    }
}
