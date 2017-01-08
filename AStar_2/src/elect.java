import java.util.*;
import java.io.*;

public class elect
{
	public class cow{
		int v1;
		int v2;
		int index;
	}

	public class Comp1 implements Comparator<cow>
	{
		public int compare(cow a, cow b)
		{
			if (a.v1 < b.v1)
				return -1;
			else if (a.v1 == b.v1)
				return 0;
			else
				return 1;	
		}
	}
	
	public class Comp2 implements Comparator<cow>
	{
		public int compare(cow a, cow b){
			if (a.v2 < b.v2)
				return -1;
			else if (a.v2 == b.v2)
				return 0;
			else
				return 1;
		}
	}
	public static void main(String args[]) throws IOException
	{
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("elect.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("elect.out")));
		int cows = in.nextInt();
		int adv = in.nextInt();
		cow [] cowvote = new cow [cows];
		for (int i = 0; i < cows; i++)
		{
			cowvote[i] = new elect().new cow();
			cowvote[i].v1 = in.nextInt();
			cowvote[i].v2  = in.nextInt();
			cowvote[i].index = i+1;
		}
		Arrays.sort(cowvote, new elect().new Comp1());
		Arrays.sort(cowvote, cows-adv, cows, new elect().new Comp2());
		//System.out.println(cowvote[cows-1].index);
		out.println(cowvote[cows-1].index);
		out.flush();
//		
	}
}
