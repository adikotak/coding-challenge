import java.util.*;
import java.io.*;

public class bones
{
	public static void main(String args[]) throws IOException
	{
		//Scanner in = new Scanner(System.in);
		 Scanner in = new Scanner(new File("bones.in"));
		 PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("bones.out")));
		int s1 = in.nextInt();
		int s2 = in.nextInt();
		int s3 = in.nextInt();
		int[] s1ar = new int[s1];
		int[] s2ar = new int[s2];
		int[] s3ar = new int[s3];
		int index = 0;
		for (int i = 1; i <= s1; i++)
		{
			s1ar[index] = i;
			index++;
		}
		index = 0;
		for (int i = 1; i <= s2; i++)
		{
			s2ar[index] = i;
			index++;
		}
		index = 0;
		for (int i = 1; i <= s3; i++)
		{
			s3ar[index++] = i;
		}
		index = 0;
		int sum = 0;
		int[] resAr = new int[s1 * s2 * s3];
		for (int i = 0; i < s1ar.length; i++)
		{
			for (int j = 0; j < s2ar.length; j++)
			{
				for (int k = 0; k < s3ar.length; k++)
				{
					sum = s1ar[i] + s2ar[j] + s3ar[k];
					resAr[index++] = sum;
				}
			}
		}
		Arrays.sort(resAr);
		int resSum = 1, tempSum = 1;
		int theInt = 0;
		for (int n = 0; n < (s1 * s2 * s3); n++)
		{
			if (n != resAr.length - 1 && resAr[n] == resAr[n + 1])
			{
				tempSum++;
				if (tempSum > resSum)
				{
					resSum = tempSum;
					theInt = resAr[n];
				}
			} else
			{
				tempSum = 1;
			}

		}
		//System.out.println(theInt);
		out.println(theInt);
		out.flush();
	}
}
