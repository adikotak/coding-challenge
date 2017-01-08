import java.util.*;

public class theatre_square
{
	public static void main (String args [])
	{
		Scanner in = new Scanner(System.in);
		long m = in.nextInt();
        long n = in.nextInt();
        long a = in.nextInt();
        long sum = m/a;
        long sum2 = n/a;
        if (m % a != 0)
        {
            sum = sum+1;
        }
        if (n % a != 0)
        {
            sum2 = sum2+1;
        }
        System.out.println(sum*sum2);
	}
	
}
