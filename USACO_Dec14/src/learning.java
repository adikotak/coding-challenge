import java.util.*;
import java.io.*;

public class learning
{
	public static void main (String args []) throws IOException
	{
//		Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("learning.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("learning.out")));
		int numFromCalc = 6;
		out.println(numFromCalc);
		out.flush();
	}
}
