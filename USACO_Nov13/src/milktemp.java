import java.util.*;
import java.io.*;

public class milktemp
{
	public static void main(String args[]) throws Exception
	{
		Scanner in = new Scanner(System.in);
//		Scanner in = new Scanner(new File("milktemp.in"));
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
//				"milktemp.out")));
		int N = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		int la = 1000000000 + 1;
		int hb = -1;
		int[] a = new int[N];
		int[] b = new int[N];
		for (int i = 0; i < N; i++)
		{
			a[i] = in.nextInt();
			b[i] = in.nextInt();
			if (a[i] < la)
			{
				la = a[i];
			}
			if (b[i] > hb)
			{
				hb = b[i];
			}
		}
		int maxMilk = -1;
		int milk;
		for (int j = la; j <= hb; j++)
		{
			milk = 0;
			for (int i = 0; i < N; i++)
			{
				if (j < a[i])
				{
					milk += x;
				} else if (j <= b[i])
				{
					milk += y;
				} else
				{
					milk += z;
				}
			}
			if (milk > maxMilk)
			{
				maxMilk = milk;
			}
		}
		System.out.println(maxMilk);
//		out.println(maxMilk);
//		out.flush();

	}
}