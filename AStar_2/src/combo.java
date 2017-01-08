import java.io.*;
import java.util.*;

public class combo
{
	public static void main(String args[]) throws Exception
	{
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("combo.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"combo.out")));
		int N = in.nextInt();
		int f1 = in.nextInt();
		int f2 = in.nextInt();
		int f3 = in.nextInt();
		int m1 = in.nextInt();
		int m2 = in.nextInt();
		int m3 = in.nextInt();
		int[] f1Array, f2Array, f3Array;
		f1Array = new int[5];
		f2Array = new int[5];
		f3Array = new int[5];
		int[] m1Array, m2Array, m3Array;
		m1Array = new int[5];
		m2Array = new int[5];
		m3Array = new int[5];
		int[] c1Array = new int[250];
		int[] c2Array = new int[250];
		int[] c3Array = new int[250];

		for (int adj = -2; adj <= 2; adj++)
		{
			f1Array[2 + adj] = f1 + adj;
			while (f1Array[2 + adj] <= 0)
			{
				f1Array[2 + adj] += N;
			}
			while (f1Array[2 + adj] > N)
			{
				f1Array[2 + adj] -= N;
			}
		}

		for (int adj = -2; adj <= 2; adj++)
		{
			f2Array[2 + adj] = f2 + adj;
			while (f2Array[2 + adj] <= 0)
			{
				f2Array[2 + adj] += N;
			}
			while(f2Array[2 + adj] > N)
			{
				f2Array[2 + adj] -= N;
			}
		}

		for (int adj = -2; adj <= 2; adj++)
		{
			f3Array[2 + adj] = f3 + adj;
			while (f3Array[2 + adj] <= 0)
			{
				f3Array[2 + adj] += N;
			}
			while (f3Array[2 + adj] > N)
			{
				f3Array[2 + adj] -= N;
			}
		}

		for (int adj = -2; adj <= 2; adj++)
		{
			m1Array[2 + adj] = m1 + adj;
			while (m1Array[2 + adj] <= 0)
			{
				m1Array[2 + adj] += N;
			}
			while (m1Array[2 + adj] > N)
			{
				m1Array[2 + adj] -= N;
			}
		}

		for (int adj = -2; adj <= 2; adj++)
		{
			m2Array[2 + adj] = m2 + adj;
			while (m2Array[2 + adj] <= 0)
			{
				m2Array[2 + adj] += N;
			}
			while (m2Array[2 + adj] > N)
			{
				m2Array[2 + adj] -= N;
			}
		}

		for (int adj = -2; adj <= 2; adj++)
		{
			m3Array[2 + adj] = m3 + adj;
			while (m3Array[2 + adj] <= 0)
			{
				m3Array[2 + adj] += N;
			}
			while (m3Array[2 + adj] > N)
			{
				m3Array[2 + adj] -= N;
			}
		}

		int c = 0;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				for (int k = 0; k < 5; k++)
				{
					c1Array[c] = f1Array[i];
					c2Array[c] = f2Array[j];
					c3Array[c] = f3Array[k];
					c++;
				}

			}
		}
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				for (int k = 0; k < 5; k++)
				{
					c1Array[c] = m1Array[i];
					c2Array[c] = m2Array[j];
					c3Array[c] = m3Array[k];
					c++;
				}
			}
		}
		int totalC = c;
		for (int i = 0; i < c - 1; i++)
		{
			if (c1Array[i] == 0)
				continue;
			for (int j = i + 1; j < c; j++)
			{
				if (c1Array[i] == c1Array[j] && c2Array[i] == c2Array[j]
						&& c3Array[i] == c3Array[j])
				{
					totalC--;
					c1Array[j] = 0;
				}
			}
		}
		//System.out.println(totalC);
		out.println(totalC);
		out.flush();

	}

}