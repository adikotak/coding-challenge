import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class odometer {
	public static void main(String args[]) throws IOException {
		// Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("odometer.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"odometer.out")));
		long x = in.nextLong();
		long y = in.nextLong();
		int count = 0;
		String one;
		for (long i = x; i <= y; i++) {
			one = Long.toString(i);
			int k = one.length();
			for (char c = '0'; c <= '9'; c++) {
				int b = 0;
				for (int j = 0; j < k; j++) {
					if (c == one.charAt(j)) {
						b++;
					}
				}
				if (b == (k - 1)) {
					count++;
				}
			}
		}
		out.println(count);
		out.flush();
	}

}