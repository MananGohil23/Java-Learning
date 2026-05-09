import java.util.*;
class recFunc{
    static int result = 1;
    static int exponential(int x, int n){
        if(n==0){
            return result;
        }
        result = result *x;
        return exponential(x,n-1);
    }
}
class lab5c{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base value : ");
        int base = sc.nextInt();
        System.out.println("Enter the order : ");
        int order = sc.nextInt();
        System.out.println("y = "+ recFunc.exponential(base , order));
    }
}