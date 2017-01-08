import java.util.*;
import java.io.*;

public class squares {
	public static void main (String args []) throws IOException
	{
		//Scanner in = new Scanner(System.in);
		 Scanner in = new Scanner(new File("squares.in"));
		 PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				 "squares.out")));
		int n = in.nextInt();
		int count = 0;
		for (int i=1; i<=500; i++)
		{
			int res = i*i;
			for (int j = 1; j<=500; j++)
			{
				int res2 = j*j;
				if (res == res2 + n)
				{
					count++;
				}
			}
		}
		out.println(count);
		out.flush();
	}

}
