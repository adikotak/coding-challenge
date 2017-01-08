import java.util.*;
import java.io.*;

public class hayexp
{
	public static void main (String args []) throws IOException
	{
//		Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("hayexp.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("hayexp.out")));
		int n = in.nextInt();
		int q = in.nextInt();
		int [] stacks = new int [n];
		int [] days = new int [q*2];
		for (int i = 0; i<n; i++)
		{
			stacks[i] = in.nextInt();
		}
		for (int i = 0; i<q*2; i++)
		{
			days[i] = in.nextInt();
		}
		int [] ans = new int [q];
		int c = 0;
		for (int i =0; i<q; i++)
		{
			while (days[c] <= days[c+1])
			{
				ans[i] += stacks[(days[c])-1];
				days[c]++;
			}
			c +=2;
		}
		for (int i =0; i<q; i++)
		{
//			System.out.println(ans[i]);
			out.println(ans[i]);
			out.flush();
		}
	}
}
