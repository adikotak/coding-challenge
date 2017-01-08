import java.util.*;
import java.io.*;

public class cowtag
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

	
	public static void main(String args[]) throws IOException
	{
//		Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("cowtag.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cowtag.out")));
		int n = in.nextInt();
		cows [] cow = new cows [n];
		for (int i=0; i<n; i++)
		{
			cow[i] = new cowtag().new cows();
			cow[i].x = in.nextDouble();
			cow[i].y = in.nextDouble();
			cow[i].idx = (i+1);
		}
		ArrayList<cows> upcow = new ArrayList<cows>();
		for (int i=0; i<n; i++)
		{
			upcow.add(cow[i]);
		}
		double min;
		int temp = 0;
		int i = 0;
		while (upcow.size() > 1)
		{
			min = Double.MAX_VALUE;
			for (int j = 0; j<upcow.size(); j++ )
			{
				if (findDist(upcow.get(i).x, upcow.get(i).y, upcow.get(j).x, upcow.get(j).y ) < min && i != j)
				{
					min = findDist(upcow.get(i).x, upcow.get(i).y, upcow.get(j).x, upcow.get(j).y );
					temp = j;
				}
			}
			if (temp < i)
			{
				i--;
			}
			upcow.remove(temp);
			i++;
			if (i >= upcow.size())
			{
				i = 0;
			}
		}
//		System.out.println(upcow.get(0).idx);
		out.println(upcow.get(0).idx);
		out.flush();
	}
}
