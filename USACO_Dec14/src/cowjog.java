import java.util.*;
import java.io.*;

public class cowjog
{
	public static ArrayList formGroups (ArrayList<Integer> list)
	{
		int index = 1;
		int i = 0;
		while (i< list.size()-1)
		{
			if (list.size() == 1)
			{
				break;
			}
			else if (list.get(i) < list.get(i+1))
			{
				index++;
			}
			i++;
		}
		if (index == list.size())
		{
			return list;
		}
		else
		{
			for (int j = 0; j<list.size()-1;j++)
			{
				if (list.get(j) > list.get(j+1))
				{
					list.remove(j);
					j = 0;
				}
			}
			return list;
		}
		
	}
	public static void main (String args []) throws IOException
	{
//		Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("cowjog.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cowjog.out")));
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = in.nextInt();
		for (int i= 0; i<n;i++)
		{
			int rand = in.nextInt();
			list.add(in.nextInt());
		}
		ArrayList<Integer> newlist = new ArrayList<Integer>();
		newlist = formGroups(list);
//		System.out.println(newlist.size());
		out.println(newlist.size());
		out.flush();
		
	}
}
