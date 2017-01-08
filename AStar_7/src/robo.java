import java.util.*;
import java.io.*;

public class robo
{
	public static void main (String args []) throws IOException
	{
//		Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("robo.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("robo.out")));
		int n = in.nextInt();
		in.nextLine();
		int [] stacks = new int [n];
		int top  = 0;
		int temp = 1;
		for (int i = 0; i<n; i++)
		{
			if (in.nextLine().equals("ADD"))
			{
				stacks[top] = temp;
				top++;
				temp++;
			}
			else 
			{
				top--;
				stacks[top] = 0;
			}
		}
		int sum = 0;
		for (int i = 0; i<n; i++)
		{
			if (stacks[i] != 0)
			{
				sum++;
			}
		}
//		System.out.println(sum);
		out.println(sum);
		out.flush();
		for (int i = 0; i<n; i++)
		{
			if (stacks[i] != 0)
			{
//				System.out.println(stacks[i]);
				out.println(stacks[i]);
				out.flush();
			}
		}
		
	}
}
