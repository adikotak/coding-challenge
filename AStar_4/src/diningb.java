import java.util.*;
import java.io.*;

public class diningb
{
	public static void main(String args[]) throws IOException
	{
//		Scanner in = new Scanner(System.in);
		 Scanner in = new Scanner(new File("diningb.in"));
		 PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("diningb.out")));
		int n = in.nextInt();
		int data[] = new int[n + 1];
		int one[] = new int[n + 1];
		int two[] = new int[n + 1];
		int ans;
		for (int i = 0; i < n; i++)
		{
			data[i] = in.nextInt();
		}
		if (data[0] == 2)
			one[0] = 1;
		else
			one[0] = 0;
		for (int i = 1; i < n; i++)
		{
			if (data[i] == 2)
				one[i] = one[i - 1] + 1;
			else
				one[i] = one[i - 1];
		}
		one[n] = one[n - 1];
		if (data[n - 1] == 1)
			two[n - 1] = 1;
		else
			two[n - 1] = 0;
		for (int i = n - 2; i >= 0; i--)
		{
			if (data[i] == 1)
				two[i] = two[i + 1] + 1;
			else
				two[i] = two[i + 1];

		}
		two[n] = 0;
		ans = two[0];
		for (int i = 0; i < n; i++)
		{
			if (one[i] + two[i + 1] < ans)
			{
				ans = one[i] + two[i + 1];
			}
		}
//		System.out.println(ans);
		out.println(ans);
		out.close();
	}

}
