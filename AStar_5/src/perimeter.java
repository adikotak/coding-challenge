import java.util.*;
import java.io.*;


public class perimeter
{
	public static int findDist(int x , int y, int x2, int y2)
	{
		return (int) (Math.sqrt(((x2-x) * (x2-x)) + ((y2-y) * (y2-y))));
	}
	
	public class cows
	{
		int x;
		int y;
	}

	
	public static void main (String args []) throws IOException
	{
		Scanner in = new Scanner(System.in);
//		Scanner in = new Scanner(new File("perimeter.in"));
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("perimeter.out")));
		int n = in.nextInt();
		cows [] cow = new cows [n];
		for (int i=0; i<n; i++)
		{
			cow[i] = new perimeter().new cows();
			cow[i].x = in.nextInt();
			cow[i].y = in.nextInt();
		}
		int min = Integer.MAX_VALUE;
		int dist = 0;
		int sum = 0;
		for (int i = 0; i<n; i++)
		{
			for (int j = i+1; j<n; j++)
			{
				if (cow[i].x == cow[j].x || cow[i].y == cow[j].y)
				{
					dist = findDist(cow[i].x, cow[i].y, cow[j].x, cow[j].y);
					if (dist < min)
					{
						min = dist;
					}
				}
			}
			sum += min;
		}
		System.out.println(sum);
	}
}
