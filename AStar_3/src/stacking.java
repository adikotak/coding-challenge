import java.util.*;
import java.io.*;

public class stacking
{
	public static int i(String s)
	{
		return Integer.parseInt(s);
	}

	public static void main(String[] args) throws Exception
	{
//		Scanner in = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new FileReader("stacking.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"stacking.out")));
		String[] arr = in.readLine().split(" ");
		int n = i(arr[0]);
		int k = i(arr[1]);
		int[] diff = new int[n + 1];

		for (int i = 0; i < k; i++)
		{
			arr = in.readLine().split(" ");
			int A = i(arr[0]) - 1;
			int B = i(arr[1]) - 1;
			diff[A]++;
			diff[B + 1]--;
		}
		int[] data = new int[n];
		int val = 0;
		for (int i = 0; i < n; i++)
		{
			val += diff[i];
			data[i] = val;
		}
		Arrays.sort(data);
		System.out.println(data[n/2]);
//		out.println(data[n / 2]);
//		out.flush();
	}
}