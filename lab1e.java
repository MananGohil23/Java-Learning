import java.util.*;
class grade{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter percentage of student : ");
        int prct = scan.nextInt();
        String grade = null;
        if(1<prct || prct<100)
        {
            if(90<=prct && prct<=100)
            {
                grade = "O";
            }
            else if(80<=prct && prct<90)
            {
                grade = "A+";
            }
            else if(70<=prct && prct<80)
            {
                grade = "A";
            }
            else if(60<=prct && prct<70)
            {
                grade = "B";
            }
            else if(50<=prct && prct<60)
            {
                grade = "C";
            }
            else if(40<=prct && prct<50)
            {
                grade = "D";
            }
            else if(prct<40)
            {
                grade = "F";
            }
            else
            {
                System.out.println("Invalid percecntage.");
            }
        }
        System.out.println("Grade awarded to student : "+grade);
    }
}