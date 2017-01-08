import java.util.*;
import java.io.*;

public class ruler
{
	static Scanner in;
	static PrintWriter out;
	static void draw (int n)
	{
		String sum;
		sum = "*";
		for (int i=1; i<n; i++)
		{
			sum += "*";
		}
//		System.out.println(sum);
		out.println(sum);
		out.flush();
		
	}
	static void d(int n)
	{
		if (n > 1)
		{
			d(n-1);
			draw(n);
			d(n-1);
			
		}
		else
		{
//			System.out.println("*");
			out.println("*");
			out.flush();
		}
	}
	public static void main (String args []) throws IOException
	{
//		Scanner in = new Scanner(System.in);
		in = new Scanner(new File("ruler.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("ruler.out")));
		int N = in.nextInt();
		for (int i = 0; i<N; i++)
		{
//			System.out.print("*");
			out.print("*");
			out.flush();
		}
//		System.out.println();
		out.println();
		out.flush();
		d(N-1);
		for (int i = 0; i<N; i++)
		{
//			System.out.print("*");
			out.print("*");
			out.flush();
		}
//		System.out.println();
		out.println();
		out.flush();
	}
}
