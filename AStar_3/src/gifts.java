import java.util.*;
import java.io.*;

public class gifts
{
	class item
	{
		int p;
		int s;
		int tp;
	}

	public class Comp2 implements Comparator<item>
	{
		public int compare(item a, item b)
		{
			if (a.tp < b.tp)
				return -1;
			else if (a.tp == b.tp)
				return 0;
			else
				return 1;
		}
	}

	public static void main(String args[]) throws IOException
	{
		Scanner in = new Scanner(System.in);
//		Scanner in = new Scanner(new File("gifts.in"));
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter( "gifts.out")));
		int n = in.nextInt();
		int b = in.nextInt();
		item[] prices = new item[n];
		for (int i = 0; i < n; i++)
		{
			prices[i] = new gifts().new item();
			prices[i].p = in.nextInt();
			prices[i].s = in.nextInt();
			prices[i].tp = prices[i].p + prices[i].s;
		}
		Arrays.sort(prices, new gifts().new Comp2());
		int coup = 0;
		int sum;
		int c;
		int ans = 0;
		item[] temp = new item[n];
		for (int i = 0; i < n; i++)
		{
			for (int k = 0; k < n; k++)
			{
				temp[k] = new gifts().new item();
				temp[k].p = prices[k].p;
				temp[k].s = prices[k].s;
				temp[k].tp = prices[k].tp;
			}
			sum = 0;
			c = 0;
			temp[coup].p /= 2;
			temp[coup].tp = temp[coup].p + temp[coup].s;
			sum += temp[coup].tp;
			if (sum <= b)
			{
				c++;
			}
			else
			{
				System.out.println("0");
				break;
			}
			for (int j = 0; j < n; j++)
			{
				if (j != coup)
				{
					sum += prices[j].tp;
					if (b >= sum)
					{
						c++;
					} else
					{
						break;
					}
				}
			}
			if (c > ans)
			{
				ans = c;
			}
			coup++;
		}
		System.out.println(ans);
//		out.println(ans);
//		out.flush();
	}

}
