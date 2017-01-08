import java.util.*;
import java.io.*;

public class fact
{
	public static int find(int i)
	{
		int x;
		if (i ==1)
			return 1;
		
		x = i*find(i-1);
		return x;	
	}

	public static void main(String args[]) throws IOException
	{
//		Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("fact.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("fact.out")));
		int x = in.nextInt();
		int ans = find(x);
//		System.out.println(ans);
		out.println(ans);
		out.close();
	}
}
