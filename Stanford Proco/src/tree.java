import java.io.IOException;
import java.util.Scanner;

public class tree
{
	public static void main(String args[]) throws IOException
	{
		int[] total = new int[100];
		double[] avg = new double[100];
		int[] nodes = new int[100];
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());

		for (int i = 0; i < n; i++)
		{
			String line = in.nextLine();
			int index = Integer.parseInt(line.charAt(0) + "");
			int val = Integer.parseInt(line.charAt(2) + "");
			for (int j = 0; j <= index; j++)
			{
				total[j] += val;
				nodes[j]++;
			}
		}

		double max = 0.0;
		for (int i = 0; i < total.length; i++)
		{
			double temp = (total[i] + 0.0) / nodes[i];
			if (temp > max)
			{
				max = temp;
			}
		}
		String temp = Double.toString(max);
		int index = temp.indexOf('.');
		temp = temp.substring(0, index + 4);

		System.out.println(temp);

	}
}
