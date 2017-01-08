import java.util.*;
import java.io.*;

public class cowpals 
{
	public static void main (String args[]) throws IOException
	{
		//Scanner in = new Scanner(System.in);
		 Scanner in = new Scanner(new File("cowpals.in"));
		 PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				 	"cowpals.out")));
		boolean theTest = true;
		int i = in.nextInt();
		while (theTest == true)
		{
			int sum = 0;
			for (int j = 1; j<i; j++)
			{
				if (i % j == 0)
				{
					sum += j;
				}
			}
			int tempSum = 0;
			for (int k = 1; k<sum;k++)
			{
				if (sum % k == 0)
				{
					tempSum += k;
				}
			}
			if (tempSum == i && !(i == sum))
			{
				out.println(i + " " + sum);
				out.flush();
				theTest = false;
			}
			else
			{
				i++;
			}	
		}
		
		
	}
}
