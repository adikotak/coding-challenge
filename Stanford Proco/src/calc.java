import java.util.*;

public class calc
{
	public static void main (String args [])
	{
		Scanner in = new Scanner(System.in);
		int numOps = Integer.parseInt(in.nextLine());
		ArrayList<String> opers = new ArrayList<String>();
		int ans = 0;
		for (int i = 0; i<numOps; i++)
		{
			opers.add(in.nextLine());
		}
		
		int numDel = 0;
		for (int i= opers.size() - 1; i>=0; i--)
		{
			String gotten = opers.get(i);
			if (gotten.charAt(0) == 'z')
			{
				numDel = Integer.parseInt(gotten.substring(2));
				opers.remove(i);
				i--;
				for (int j=0; j<numDel; j++)
				{
					opers.remove(i);
					i--;
				}
			}
		}

		for (int i = 0; i<opers.size(); i++)
		{
			if (opers.get(i).equals("+"))
			{
				ans++;
			}
			else if (opers.get(i).equals("-"))
			{
				ans--;
			}		
		}
		
		System.out.println(ans);
		
	}
}
