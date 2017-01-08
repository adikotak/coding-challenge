import java.util.*;
import java.io.*;

public class paint
{
	public static void main (String args[]) throws IOException
	{
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("paint.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("paint.out")));
		int[] posts = new int[4];
		posts[0] = in.nextInt();
		posts[1] = in.nextInt();
		posts[2] = in.nextInt();
		posts[3] = in.nextInt();
		Arrays.sort(posts);
		//System.out.println(posts[3]-posts[0]);
		out.println(posts[3]-posts[0]);
		out.flush();
	}
}
