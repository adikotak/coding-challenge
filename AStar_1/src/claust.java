import java.util.*;
import java.io.*;

public class claust
{
	public static double findDist(double x , double y, double x2, double y2)
	{
		return (Math.sqrt(((x2-x) * (x2-x)) + ((y2-y) * (y2-y))));
	}
	
	public class cows
	{
		double x;
		double y;
		int idx;
	}
	
	public static void main (String args []) throws IOException
	{
//		Scanner in = new Scanner(System.in);
		 Scanner in = new Scanner(new File("claust.in"));
		 PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("claust.out")));
		int n = in.nextInt();
		cows [] cow = new cows [n];
		for (int i=0; i<n; i++)
		{
			cow[i] = new claust().new cows();
			cow[i].x = in.nextDouble();
			cow[i].y = in.nextDouble();
			cow[i].idx = (i+1);
		}
		double close;
		double min = Double.MAX_VALUE;
		int [] ans = new int [2];
		for (int i=0; i<n; i++)
		{
			for (int j = 0; j<n; j++)
			{
				if (i != j)
				{
					close = findDist(cow[i].x, cow[i].y, cow[j].x, cow[j].y);
					if (min > close)
					{
						min = close;
						ans[0] = cow[i].idx;
						ans[1] = cow[j].idx ;
					}
				}
			}
			
		}
		Arrays.sort(ans);
//		System.out.print(ans[0] + " " + ans[1]);
		out.print(ans[0] + " " + ans[1]);
		out.flush();
		out.println();
		out.flush();
	}
}
