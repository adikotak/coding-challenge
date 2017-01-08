import java.util.*;
import java.io.*;

public class marathon
{
	public class point
	{
		int x;
		int y;
		int distToNext;
		int distIfSkipped;
		int DistSaved;
	}

	public static void main(String args[]) throws IOException
	{
//		Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("marathon.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("marathon.out")));
		int n = in.nextInt();
		point[] loc = new point[n];
		for (int i = 0; i < n; i++)
		{
			loc[i] = new marathon().new point();
			loc[i].x = in.nextInt();
			loc[i].y = in.nextInt();
		}
		for (int i = 0; i < n-2; i++)
		{
			loc[i].distToNext = Math.abs(loc[i].x - loc[i+1].x)
					+ Math.abs(loc[i].y - loc[i+1].y);
			loc[i].distIfSkipped = Math.abs(loc[i].x - loc[i+2].x) + Math.abs(loc[i].y - loc[i+2].y);
		}
		loc[n-2].distToNext = Math.abs(loc[n-2].x - loc[n-1].x) + Math.abs(loc[n-2].y - loc[n-1].y);
		loc[n-2].distIfSkipped = 10000000;
		
		int answer = 0;
		for (int i = 0; i<n;i++)
		{
			answer += loc[i].distToNext;
		}
		
		int [] saved = new int[n-2];
		
		for (int i =0; i< n-2; i++)
		{
			saved[i] = loc[i].distToNext-loc[i].distIfSkipped + loc[i+1].distToNext;
		}
		Arrays.sort(saved);
		int temp = answer - saved[saved.length-1];
		if (temp < answer)
		{
			answer = temp;
		}
//		System.out.println(answer);
		out.println(answer);
		out.flush();

	}

}
