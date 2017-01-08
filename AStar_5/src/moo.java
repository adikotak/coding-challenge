import java.util.*;
import java.io.*;

public class moo
{
	public static int len(int k)
	{	
		if (k == -1)
			return 0;
		else if (k == 0) 
			return 3;
		return (len(k-1) + (k+3) + len(k-1));
		}
	
	
	public static char solve (int n, int k)
	{
		if (n > len(k)) return solve (n, k+1);
		if (n <= len(k-1)) return solve (n, k-1);
		n -= len(k-1);
		if (n <= (k+3))
		{
			if (n == 1)
			{
				return 'm';
			}
			else
			{
				return 'o';
			}
		}
		n -= (k+3);
		return solve (n, k-1);
	}
	
	public static void main (String args []) throws IOException
	{
//		Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("moo.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("moo.out")));
		int n = in.nextInt();
//		System.out.println(solve(n,0));
		out.println(solve(n,0));
		out.flush();
	}
}
