import java.util.*;

class switch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Choose an operation : \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Result : " + (a+b));
                break;
            case 2:
                System.out.println("Result : " + (a-b));
                break;
            case 3:
                System.out.println("Result : " + (a*b));
                break;
            case 4:
                if(b != 0){
                    System.out.println("Result : " + (a/b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}