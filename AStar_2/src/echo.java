import java.util.*;
import java.io.*;

public class echo
{
	public static void main (String args []) throws IOException
	{
		//Scanner in = new Scanner(System.in);
		 Scanner in = new Scanner(new File("echo.in"));
		 PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
			 "echo.out")));
		String A = in.nextLine();
		String B = in.nextLine();
		int use = 0;
		int Alen = A.length();
		int Blen = B.length();
		int ans1 = 0,ans2 = 0;
		if (Blen <= Alen)
		{
			use = Blen;
		}
		else
		{
			use = Alen;
		}
		for (int s = 0; s <= use; s++)
		{
			String sbstrA = A.substring(Alen-s, Alen);
			String sbstrB = B.substring(0, s);
			if (sbstrA.equals(sbstrB))
			{
				ans1 = sbstrA.length();
			}
		}
		for (int s = 0; s<use; s++)
		{
			String sbstrA = A.substring(0, s);
			String sbstrB = B.substring(Blen-s, Blen);
			if (sbstrA.equals(sbstrB))
			{
				ans2 = sbstrA.length();
			}
		}
		if (ans1 >= ans2)
		{
			//System.out.println(ans1);
			out.println(ans1);
			out.flush();
		}
		else
		{
			//System.out.println(ans2);
			out.println(ans2);
			out.flush();
		}
	}

}
