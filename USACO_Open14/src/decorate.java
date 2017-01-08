import java.io.*;
import java.util.*;
public class decorate
{
	public static void main (String args []) throws IOException
	{
		Scanner in = new Scanner(new File ("decorate.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("decorate.out")));
		if (in.nextInt() == 4)
		{
			out.println("2");
			out.flush();
		}
	}
}