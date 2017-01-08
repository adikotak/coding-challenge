import java.io.*;
import java.util.*;


public class shelf
{
	public static void main (String args []) throws IOException
	{
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("shelf.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("shelf.out")));
		int n = in.nextInt();
		int height = in.nextInt();
		int [] cows = new int [n];
		for (int i =0; i<n; i++)
		{
			cows[i] = in.nextInt();
		}
		Arrays.sort(cows);
		int len;
		int c =0;
		int sum = 0;
		for (len = cows.length-1; len>0; len-- )
		{
			sum += cows[len];
			if (sum < height)
			{
				c++;
			}
		}
		//System.out.println(c+1);
		out.println(c+1);
		out.flush();
	}
	
}
