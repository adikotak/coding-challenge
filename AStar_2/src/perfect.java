import java.util.*;
import java.io.*;

public class perfect
{
	public static void main (String args []) throws IOException
	{
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("perfect.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("perfect.out")));
		int num = in.nextInt();
		int [][] list = new int [num][num];
		for (int row = 0; row< num; row++)
		{
			for (int col = 0; col<num; col++)
			{
				list[row][col] = in.nextInt();
			}
		}
		int [] ar = new int [num];
		int [] medAr = new int [num];
		for (int row = 0; row< num; row++)
		{
			for (int col = 0; col<num; col++)
			{
				ar[col] = list[row][col];
			}
			Arrays.sort(ar);
			medAr[row] = ar[num/2];
		}
		Arrays.sort(medAr);
		//System.out.println(medAr[num/2]);
		out.println(medAr[num/2]);
		out.flush();
	}

}
