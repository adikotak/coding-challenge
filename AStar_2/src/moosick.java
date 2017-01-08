import java.util.*;
import java.io.*;

public class moosick
{
	static int n;
	static int [] fjnote;
	static int c;
	static int [] rumcord;
	static int [] ans;
	public static void translate(int [] ar)
	{
		int min  = Integer.MAX_VALUE;
		for (int i = 0; i<c; i++)
		{
			if (i == 0 || ar[i] < min)
			{
				min = ar[i];
			}
		}
		for (int i = 0; i<c; i++)
		{
			ar[i] -= min;
		}
	}
	
	public static int match(int index)
	{
		int [] P  = new int [c];
		int [] Q  = new int [c];
		for (int i = 0; i<c; i++)
		{
			P[i] = fjnote[i+index];
			Q[i] = rumcord[i];
		}
		translate(P);
		translate(Q);
		Arrays.sort(P);
		Arrays.sort(Q);
		for (int i = 0; i<c; i++)
		{
			if (P[i] != Q[i])
			{
				return 0;
			}
		}	
		return 1;
	}
	public static void main (String args []) throws IOException
	{
		Scanner in = new Scanner(System.in);
//		Scanner in = new Scanner(new File("moosick.in"));
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("moosick.out")));
		n = in.nextInt();
		fjnote = new int [n];
		for (int i = 0; i<n; i++)
		{
			fjnote[i] = in.nextInt();
		}
		c = in.nextInt();
		rumcord = new int [c];
		for (int i =0; i< c; i++)
		{
			rumcord[i] = in.nextInt();
		}
		ans = new int [n];
		int total = 0;
		for (int i = 0; (i+c)<=n;i++)
		{
			ans[i] = match(i);
			total += ans[i];
		}
		System.out.println(total);
//		out.println(total);
//		out.flush();
		for (int i = 0; i<n; i++)
		{
			if (ans[i] != 0)
			{
				System.out.println(i+1);
//				out.println(i+1);
//				out.flush();
			}
		}
	}
}
