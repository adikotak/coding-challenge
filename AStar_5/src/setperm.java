import java.util.*;
import java.io.*;


public class setperm
{
//	static Scanner in = new Scanner(System.in);
	static Scanner in; 
	static PrintWriter out;
	static int [] nums;
	static int [] ans;
	static boolean [] used;
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
				if (used[j] == false )
				{
					ans[i] = nums[j];
					used[j] = true;
					gen(i+1);
					used[j] = false;
				}
			}
			
			
		}
		
	}
	
	public static void main (String args []) throws IOException
	{
		in = new Scanner(new File("setperm.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("setperm.out")));
		m = in.nextInt();
		nums = new int [m];
		used = new boolean [m];
		for (int i = 0; i<m; i++)
		{
			nums[i] = in.nextInt();
			used[i] = false;
		}
		n = in.nextInt();
		ans = new int [n];
		gen (0);
	}
}
