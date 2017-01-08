import java.util.*;
import java.io.*;

public class fib
{
	public static int find (int i)
	{
		if (i <= 2)
		{
			return 1;
		}
		else
		{
			return i = (find(i-1)+ find(i-2));
		}
		
	}
	public static void main (String args []) throws IOException
	{
//		Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("fib.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("fib.out")));
		int n = in.nextInt();
		int ans = find(n);
//		System.out.println(ans);
		out.println(ans);
		out.close();
		
		
	}

}
