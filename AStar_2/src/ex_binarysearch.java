import java.util.*;

public class ex_binarysearch
{
	static Scanner in;
	static int num;

	public static void main(String args[])
	{
		in = new Scanner(System.in);
		num = in.nextInt();
		int[] ar = new int[num];
		for (int i = 0; i < num; i++)
		{
			ar[i] = in.nextInt();
		}
		ar = sort(ar);
		int x = in.nextInt();
		int where = search(x, ar);
		System.out.println(where);
	}

	public static int search(int x, int[] ar)
	{
		int beg = 0;
		int end = num;
		int mid = 0;
		ar = sort(ar);
		while (beg + 1 < end)
		{
			mid = (beg + end) / 2;
			if (ar[mid] == x)
			{
				return mid;
			} else if (ar[mid] > x)
			{
				beg = mid;
				mid = (beg + end)/2;
			} else
			{
				end = mid;
				mid = (beg + end)/2;
			}
		}
		return mid;

	}

	public static int[] sort(int[] ar)
	{
		for (int i = 0; i < ar.length; i++)
		{
			int min = ar[i];
			int min2 = i;
			for (int j = i; j < ar.length; j++)
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
