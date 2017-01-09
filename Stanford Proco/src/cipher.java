import java.util.*;
import java.io.*;

public class cipher
{
	public static void main(String args[]) throws IOException
	{
		char[] translator = { 'l', 'j', 'g', 'c', 'p', 'a', 'w', 'e', 'o', 'f',
				'u', 'k', 'b', 'n', 'h', 'd', 'x', 'r', 'z', 'y', 't', 'q',
				'i', 'v', 's', 'm' };
		
		char read = 'v';

		Scanner in = new Scanner(new FileReader("cipher.txt"));
		while (in.hasNext())
		{
			String x = in.nextLine();
			x = x.toLowerCase();
			for (int i = 0; i < x.length(); i++)
			{
				if ((x.charAt(i)-'a' >= 0) && (x.charAt(i)-'a' <= 25))
				{
					read = translator[x.charAt(i)-'a'];
					System.out.print(read);	
				}
				else
				{
					System.out.print(x.charAt(i));
				}
			}
			System.out.println();
		}
	}

}
