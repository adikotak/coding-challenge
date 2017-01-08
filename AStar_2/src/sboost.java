import java.util.*;
import java.io.*;

public class sboost
{
	public class parts
	{
		double f;
		double m;
		double acc;
		int index;
	}
	
	public class Comp1 implements Comparator<parts>
	{
		public int compare(parts a, parts b)
		{
			if (a.acc < b.acc)
				return -1;
			else if (a.acc == b.acc)
				return 0;
			else
				return 1;	
		}
	}
	
	public static void main(String args[]) throws IOException
	{
//		Scanner in = new Scanner (System.in);
		Scanner in = new Scanner(new File("sboost.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter( "sboost.out")));
		int orgF = in.nextInt();
		int orgM = in.nextInt();
		double testCase = orgF / orgM;
		int n = in.nextInt();
		parts [] part= new parts [n];
		for (int i = 0; i< n; i++)
		{
			part[i] = new sboost().new parts();
			part[i].f = in.nextInt();
			part[i].m = in.nextInt();
			part[i].acc = part[i].f/part[i].m;
			part[i].index = i+1;
		}
		Arrays.sort(part, new sboost().new Comp1());
		int sum = 0;
		int ans[] =  new int [n];
		if (part[n-1].acc < testCase)
		{
//			System.out.println("NONE");
			out.println("NONE");
			out.flush();
		}
		for (int i = 0; i< n; i++)
		{
			if (part[(n-1)-i].acc > testCase)
			{
				orgF += (part[(n-1)-i].f);
				orgM += (part[(n-1)-i].m);
				testCase = orgF / orgM;
				ans[i] = part[(n-1)-i].index;
			}
		}
		Arrays.sort(ans);
		for (int i = 0; i< n; i++)
		{
			if (ans[i] != 0)
			{
//				System.out.println(ans[i]);
				out.println(ans[i]);
				out.flush();
			}
		}
		
	}

}
