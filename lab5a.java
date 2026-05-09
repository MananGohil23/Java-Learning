import java.util.*;
class employ{
    Scanner sc = new Scanner(System.in);
    int empid;
    String empname;
    String designation;
    int salary;
    void getemployee(){
        System.out.println("Enter employee id , name , designation and salary :");
        empid = sc.nextInt();
        empname = sc.next();
        designation = sc.next();
        salary = sc.nextInt();
    }
    void showgade(){
        if(salary >= 10000){
            System.out.println(empname +" : Salary Grade A");
        }
        else if(7000<salary && salary<10000 ){
            System.out.println(empname +" : Salary Grade B");
        }
        else if(3000<salary && salary<7000){
            System.out.println(empname +" : Salary Grade C");
        }
        else{
            System.out.println(empname +" : Salary Grade D");
        }
    }
    void showEmployee(){
        System.out.println("ID : "+empid+" Name : "+empname +" Designation : "+designation+" Salary : "+salary);
    }
}

class lab5a{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees :");
        int n = sc.nextInt();
        employ a[] = new employ[n];
        for(int i = 0;i<n;i++){
            a[i] = new employ();
            a[i].getemployee();
        }
        System.out.println("List of Employees : ");
        for(int i=0;i<n;i++){
            a[i].showEmployee();   
        }
        System.out.println("Salary grades of the employee :");
        for(int i =0;i<n;i++){
            a[i].showgade();
        }
    }
}
