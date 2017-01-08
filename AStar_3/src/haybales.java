import java.util.*;
import java.io.*;

public class haybales
{
	public static void main(String args[]) throws IOException
	{
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("haybales.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("haybales.out")));
		int num = in.nextInt();
		int[] stacks = new int[num];
		for (int i = 0; i < num; i++)
		{
			stacks[i] = in.nextInt();
		}
		int sum =0;
		for (int i = 0; i < num; i++)
		{
			sum += stacks[i];
		}
		int avg = sum/num;
		int ans =0;
		for (int i=0; i<num; i++)
		{
			if (stacks[i] > avg)
			{
				ans+= (stacks[i]-avg);
			}
		}
		//System.out.println(ans);
		out.println(ans);
		out.flush();
		
	}

}
