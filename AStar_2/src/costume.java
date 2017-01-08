import java.util.*;
import java.io.*;

public class costume
{
	public static void main (String args []) throws IOException
	{
		//Scanner in = new Scanner(System.in);
		 Scanner in = new Scanner(new File("costume.in"));
		 PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("costume.out")));
		int numCows = in.nextInt();
		int size = in.nextInt();
		int [] cowsize = new int[numCows];
		for (int i = 0; i< numCows; i++)
		{
			cowsize[i] = in.nextInt();
		}
		Arrays.sort(cowsize);
		int cowsiz = cowsize.length;
		int counter = 0;
		for (int i = 0; i< cowsiz; i++)
		{
			int x = i+1;
			for (int j = x; j<cowsiz; j++)
			{
				if (cowsize[i] + cowsize[j] <= size)
				{
					counter++;
				}
			}
		}
		//System.out.println(counter);
		out.println(counter);
		out.flush();
	}
}
