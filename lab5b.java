import java.util.*;
class calcArea{
    void area(int side){
        System.out.println("Area of Square is : "+side*side);
    }
    void area(int length , int breadth){
        System.out.println("Area of Rectangle is : "+length*breadth);
    }
}

class lab5b{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        calcArea shape = new calcArea();
        System.out.println("Enter choice for calculation of area.\n1.Square\n2.Rectangle");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter the value for side of square : ");
                int side = sc.nextInt();
                shape.area(side);
                break;
            case 2:
                System.out.println("Enter the value for length and breadth of rectangle");
                int length = sc.nextInt();
                int breadth = sc.nextInt();
                shape.area(length,breadth);
                break;
            default:
                System.out.println("Please enter a valid choice.");
        }
    }
}
