import java.util.*;
import java.io.*;


public class setall
{
//	static Scanner in = new Scanner(System.in);
	static Scanner in; 
	static PrintWriter out;
	static int [] nums;
	static int [] ans;
	static int m,n;
	
	public static void gen(int i)
	{
		if (i == n)
		{
			for (int j = 0; j<n; j++)
			{
//				System.out.print(ans[j]);
				out.print(ans[j]);
				out.flush();
			}
//			System.out.println();
			out.println();
			out.flush();
		}
		else
		{
			for (int j = 0; j<m; j++)
			{
				ans[i] = nums[j]; 
				gen(i+1);
			}
		}
		
	}
	
	public static void main (String args []) throws IOException
	{
		in = new Scanner(new File("setall.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("setall.out")));
		m = in.nextInt();
		nums = new int [m];
		for (int i = 0; i<m; i++)
		{
			nums[i] = in.nextInt();
		}
		n = in.nextInt();
		ans = new int [n];
		gen (0);
	}

}
