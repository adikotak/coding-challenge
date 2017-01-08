import java.util.*;
import java.io.*;

public class commas {
	public static void main (String args[]) throws IOException
	{
		//Scanner in = new Scanner(System.in);
		 Scanner in = new Scanner(new File("commas.in"));
		 PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				 "commas.out")));
		long n = in.nextLong();
		String num = Long.toString(n);
		int len = num.length();
		//System.out.print(num.charAt(0));
		out.print(num.charAt(0));
		out.flush();
		for (int i = 1; i < len; i++)
		{
			if ((len-i)%3 == 0)
			{
				//System.out.print(",");
				out.print(",");
				out.flush();
			}
			//System.out.print(num.charAt(i));
			out.print(num.charAt(i));
			out.flush();
		}
		out.println();
		out.flush();
	}
}
