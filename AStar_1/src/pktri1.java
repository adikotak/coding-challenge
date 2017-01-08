import java.util.*;
import java.io.*;

public class pktri1
{
	public static void main(String args[]) throws IOException
	{
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("pktri1.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("pktri1.out")));
		int N = in.nextInt();
		int seed = in.nextInt();
		int len = (N * (N + 1) / 2);
		int[] nums = new int[len];
		for (int i = 0; i < len; i++)
		{
			nums[i] = seed;
			seed++;
			if (seed > 9)
			{
				seed = 1;
			}
		}
		int[][] pktri = new int[N][N];
		pktri[0][0] = nums[0];
		int c = 1;
		int row;
		for (int col = 1; col < N; col++)
		{
			row = 0;
			while (row <= col)
			{
				pktri[row][col] = nums[c];
				c++;
				row++;
			}
		}
		int x = 0;
		int j = x;
		for (int i = 0; i < N; i++)
		{
			for (j = 0; j < N; j++)
			{
				if (j != N-1)
				{
					if (pktri[i][j] == 0)
					{
						//System.out.print("  ");
						out.print("  ");
						out.flush();
					}
					else
					{
						//System.out.print(pktri[i][j] + " ");
						out.print(pktri[i][j] + " ");
						out.flush();
					}	
				}
				else
				{
					//System.out.print(pktri[i][j]);
					out.print(pktri[i][j]);
					out.flush();
				}
			}
			//System.out.println();
			out.println();
			out.flush();
		}

	}

}
