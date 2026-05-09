import java.util.*;
class abc{
    int id;
    String name;

    void display()
    {
        System.out.println(id + " "+name);
    }
}

class xyzmain{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        abc a[] = new abc[3];
        for(int i=0;i<3;i++)
        {
            a[i] = new abc();
            System.out.println("Enter id");
            a[i].id = sc.nextInt();
            System.out.println("Enter Name");
            a[i].name = sc.next();
        }
        for(int i=0;i<3;i++)
        {
            a[i].display();
        }
    }
}