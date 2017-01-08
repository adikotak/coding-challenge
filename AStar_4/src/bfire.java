import java.util.*;
import java.io.*;

public class bfire
{
	public static void main (String args []) throws IOException
	{
		Scanner in = new Scanner(System.in);
//		Scanner in = new Scanner(new File("bfire.in"));
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("bfire.out")));
		int n = in.nextInt();
		int [] cows = new int [n];
		for (int i = 0; i<n; i++)
		{
			cows[i] = i+1;
		}
		int temp,temp2;
		int chair;
		int [] moved = new int [n*5];
		temp = cows[1];
		cows[1] = cows[0];
		chair = 1;
		int nextchair = -1;
		int moveamt;
		int counter =0;
		moved[0] = 1;
		int there = 0;
		while (nextchair != chair)
		{
			moveamt = temp*2;
			Arrays.sort(moved);
			there = Arrays.binarySearch(moved, temp);
			if (there > 0)
			{
				cows[temp] = moved[moved.length-1];
				System.out.println(cows[temp]);
//				out.println(cows[temp]);
//				out.close();
				break;
			}
			if (moveamt > n)
			{
				moveamt -= n;
			}
			temp2 = cows[moveamt-1];
			cows[temp2-1] = temp;
			nextchair = temp2;
			moved[counter] = temp;
			temp = temp2;
		}
		if (there < 0)
		{
			System.out.println(cows[0]);
//			out.println(cows[0]);
//			out.close();
		}
		
	}
	
}
