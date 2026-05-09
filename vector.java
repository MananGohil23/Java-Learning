import java.util.*;
class vector{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		Vector<Integer> marks = new Vector<>();
		System.out.println("Enter 11 marks :");
		for(int i = 0;i<11;i++)
		{
			marks.add(scan.nextInt());
		}
		System.out.println(marks);
		System.out.println(marks.size());
		System.out.println(marks.capacity());
		
	}
}