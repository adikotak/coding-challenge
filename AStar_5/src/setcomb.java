import java.util.*;
import java.io.*;


public class setcomb
{
//	static Scanner in = new Scanner(System.in);
	static Scanner in; 
	static PrintWriter out;
	static int [] nums;
	static int [] ans;
	static int m,n;
	public static void gen(int i, int index)
	{
		if (i == n)
		{
			for (int j = 0; j<n; j++)
			{
//				System.out.print(ans[j]);
				out.print(ans[j]);
				out.flush();
			}
			System.out.println();
			out.println();
			out.flush();
		}
		else
		{
			for (int j = index; j<m; j++)
			{
				ans[i] = nums[j];
				gen(i+1, j+1);
			}
			
		}
		
	}
	
	public static void main (String args []) throws IOException
	{
		in = new Scanner(new File("setcomb.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("setcomb.out")));
		m = in.nextInt();
		nums = new int [m];
		for (int i = 0; i<m; i++)
		{
			nums[i] = in.nextInt();
		}
		n = in.nextInt();
		ans = new int [n];
		gen(0,0);
	}
}
