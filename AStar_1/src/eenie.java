import java.util.*;
import java.io.*;

public class eenie
{
	public static void main(String args[]) throws IOException
	{
//		Scanner in = new Scanner(System.in);
		 Scanner in = new Scanner(new File("eenie.in"));
		 PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("eenie.out")));
		int n = in.nextInt();
		ArrayList cows = new ArrayList();
		for (int i = 0; i<n;i++)
		{
			cows.add(i+1);
		}
		int moves = in.nextInt();
		int [] seq = new int [moves];
		for (int i = 0; i<moves; i++)
		{
			seq[i] = in.nextInt();
		}
		int x = 0;
		while (cows.size() > 1)
		{
			for (int i = 0; i<moves; i++)
			{
				x += (seq[i]-1);
				while (x >= cows.size())
				{
					x -= cows.size();
				}
				cows.remove(x);
				if (cows.size() == 1)
				{
					break;
				}
			}
		}
//		System.out.println(cows.get(0));
		out.println(cows.get(0));
		out.flush();
		
	}
}
