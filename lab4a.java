import java.util.*;
class stdname{
	public static void main(String args[])
	{
		Vector <String> stdname = new Vector<>();
		for(int i = 0;i<args.length;i++)
		{
			stdname.add(args[i]);
		}
		System.out.println(stdname);
	}
}