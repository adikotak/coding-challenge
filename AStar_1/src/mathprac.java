import java.util.*;
import java.io.*;

public class mathprac {
	public static void main (String args[]) throws IOException
	{
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("mathprac.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
			"mathprac.out")));
		int a = in.nextInt();
		int b = in.nextInt();
		int e = a+1;
		long res;
		int ones = 0;
		while (e < 63.0 && e>a)
		{
			res = (long) Math.pow(2, e);
			while (res > 9)
			{
				res /= 10;
				ones = (int) res;
			}
			if (ones == b)
			{
				//System.out.println(e);
				out.println(e);
				out.flush();
				e = 64;
			}
			else
			{
				e++;
			}
			if (e == 63)
			{
				//System.out.println("0");
				out.println("0");
				out.flush();
			}
		}
		
	}

}
