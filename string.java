import java.util.Scanner;
class str{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text :");
        String s1 = scan.nextLine();
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        String s2 = s1.concat(" program");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}       