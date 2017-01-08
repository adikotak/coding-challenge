import java.util.*;

public class problem2
{
	public static void main(String args[])
	{
		long num1 = 1;
		long num2 = 0;
		long fib = 0;
		long sum = 0;
		while ( fib < 4000000)
		{
			fib = num1 + num2;
			if (fib %2 == 0)
			{
				sum+= fib;
			}
			num1 = num2;
			num2 = fib;
		}
		System.out.println(sum);

	}
}
