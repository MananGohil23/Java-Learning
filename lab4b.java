import java.util.*;
class strvector{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of strings to be added :");
		int n = scan.nextInt();
		Vector<String> text = new Vector<>();
		System.out.println("Enter "+n+" strings :");
		scan.nextLine();
		for(int i=0;i<n;i++)
		{
			text.add(scan.nextLine());
		}
		System.out.println(text);
		System.out.println("Enter string that you want to verify:");
		String toDelete = scan.nextLine();
		if(text.contains(toDelete))
		{
			System.out.println("The given string is present in the vector. Will delete it now -_-");
			text.remove(toDelete);
		}
		else
		{
			System.out.println("The given string is not present in the vector. Adding it now!!!");
			text.add(toDelete);
		}
		System.out.println(text);
	}
}