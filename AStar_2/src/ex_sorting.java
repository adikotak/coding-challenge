import java.util.*;

public class ex_sorting
{
	public static void main (String args [])
	{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int [] sortAr = new int [num];
		for (int i = 0; i<num; i++)
		{
			sortAr[i] = in.nextInt();
			
		}
		sortAr = sort(sortAr);
		for (int i = 0; i<sortAr.length; i++)
		{
			System.out.println(sortAr[i]);
		}
	}
	
	public static int[] sort(int[] ar)
	{
		for (int i = 0; i<ar.length; i++)
		{
			int min = ar[i];
			int min2 = i;
			for (int j = i; j<ar.length; j++)
			{
				if (ar[j] < min)
				{
					min = ar[j];
					min2 = j;
				}
				
			}
			int temp;
			temp = ar[i];
			ar[i] = ar[min2];
			ar[min2] = temp;
			
		}
		return ar;
	}
}
