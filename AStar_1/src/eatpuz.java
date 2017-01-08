import java.util.*;
import java.io.*;

public class eatpuz
{
	public static void main(String args[]) throws IOException
	{
//		Scanner in = new Scanner(System.in);
		 Scanner in = new Scanner(new File("eatpuz.in"));
		 PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("eatpuz.out")));
		int C = in.nextInt();
		int B = in.nextInt();
		int [] bucks = new int [B];
		int sum;
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i<B; i++)
		{
			bucks[i] = in.nextInt();
		}
		for (int i = 0; i < 1<<B; i++)
		{
			sum = 0;
			for (int j = 0; j < B; j++)
			{
				if ((i & (1<<j)) != 0)
				{
					sum += bucks[j];
				}
			}
			if (sum > ans && sum <= C)
			{
				ans = sum;
			}
		}
//		System.out.println(ans);
		out.println(ans);
		out.flush();

	}

}
