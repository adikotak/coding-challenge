import java.util.*;
import java.io.*;

public class milktemp
{
	public static void main (String args []) throws IOException
	{
//		Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("milktemp.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milktemp.out")));
		int n = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		int ar1 [] = new int [n+1];
		int ar2 [] = new int [n+1];
		for (int i = 0; i<n; i++)
		{
			ar1[i] = in.nextInt();
			ar2[i] = in.nextInt();
		}
		Arrays.sort(ar1, 0, n);
		Arrays.sort(ar2, 0 ,n);
		ar1[n] = 1000000001;
		ar2[n] = 1000000001;
		int i = 0; int j= 0;
		int current = n*x;
		int ans = n*x;
		while (i<n || j<n)
		{
			if (ar1[i] <= ar2[j])
			{
				current += y-x;
				i++;
			}
			else
			{
				current += z-y;
				j++;
			}
			if (current > ans)
			{
				ans = current;
			}
		}

//		System.out.println(ans);
		out.println(ans);
		out.flush();
	}
}
