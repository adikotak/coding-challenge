import java.util.*;
import java.io.*;

public class acng {
	private static int funct(int n) 
	{
		if (n %2 ==0)
			return n/2;
		else
			return 3*n +1;
	}
	public static void main (String args []) throws IOException
	{
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("acng.in"));
				 PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				 "acng.out")));
		int n = in.nextInt();
		int count = 0;	
		while (n!=1)
		{
			n = funct(n);
			count++;
		}
		//System.out.println(count);
		out.println(count);
		out.flush();
	}
	
}
