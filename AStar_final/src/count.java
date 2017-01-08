import java.util.*;
import java.io.*;

public class count
{
	public static void main(String args[]) throws IOException
	{
//		Scanner in = new Scanner(System.in);
		 Scanner in = new Scanner(new File("count.in"));
		 PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("count.out")));
		int n = in.nextInt();
		char noNum = in.next().charAt(0);
		long x = Long.MAX_VALUE;
		String value = new String();
		int max = Integer.MIN_VALUE;
		int ret;
		for (int i = 1; i < x; i++)
		{
			ret = 1;
			value = i + "";
			int len = value.length();
			for (int j = 0; j < len; j++)
			{
				if (value.charAt(j) == noNum)
				{
					ret = -1;
					break;
				}
			}
			if (ret > 0)
			{
				n--;
				if (i > max)
				{
					max = i;
				}
			}
			if (n == 0)
			{
				break;
			}
		}
//		System.out.println(max);
		out.println(max);
		out.flush();

	}
}
