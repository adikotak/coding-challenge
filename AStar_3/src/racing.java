import java.util.*;
import java.io.*;

public class racing
{
	public static void main(String args[]) throws IOException
	{
		//Scanner in = new Scanner(System.in);
		 Scanner in = new Scanner(new File("racing.in"));
		 PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("racing.out")));
		int sec = in.nextInt();
		int goaldist = in.nextInt();
		int upspeed = in.nextInt();
		int flatspeed = in.nextInt();
		int downspeed = in.nextInt();
		String ter = new String();
		int terInt[] = new int[goaldist];
		String spam = new String();
		spam = in.nextLine();
		for (int i = 0; i < goaldist; i++)
		{
			ter = in.nextLine();
			if (ter.equals("u"))
			{
				terInt[i] = upspeed;
			} 
			else if (ter.equals("d"))
			{
				terInt[i] = downspeed;
			} else if (ter.equals("f"))
			{
				terInt[i] = flatspeed;
			}
		}
		int retVal[] = new int[goaldist];
		for (int i = 0; i < goaldist; i++)
		{
			if (terInt[i] == upspeed)
			{
				retVal[i] = downspeed;
			} else if (terInt[i] == downspeed)
			{
				retVal[i] = upspeed;
			} else
			{
				retVal[i] = flatspeed;
			}
		}
		int count = 0;
		int sum = 0;
		for (int i = 0; i < goaldist; i++)
		{
			sum = sum + (terInt[i] + retVal[i]);
			if (sum <= sec)
			{
				count++;
			} else
			{
				break;
			}
		}
//		System.out.println(count);
		 out.println(count);
		 out.flush();
	}
}
