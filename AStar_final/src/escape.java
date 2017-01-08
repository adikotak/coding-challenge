import java.io.*;
import java.util.*;

public class escape
{
	public class weight
	{
		int w;
		String weight = w+"";
		int len = weight.length();
		
	}
	public static void main (String args []) throws IOException
	{
		Scanner in = new Scanner(System.in);
//		Scanner in = new Scanner(new File("escape.in"));
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("escape.out")));
		int n = in.nextInt();
		weight [] cows = new weight[n];
		for (int i = 0; i<n; i++)
		{
			cows[i] = new escape().new weight();
			cows[i].w = in.nextInt();
		}
		int counter;
		int max = Integer.MIN_VALUE;
		
		
	}
}
