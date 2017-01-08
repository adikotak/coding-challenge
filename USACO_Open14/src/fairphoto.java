import java.io.*;
import java.util.*;

public class fairphoto {
	static int posArray[];
	static String bArray[];

	public static void sort() {
		for (int i = 0; i < posArray.length - 1; i++) {
			for (int j = (1 + i); j < posArray.length; j++) {
				if (posArray[i] > posArray[j]) {
					int tempInt = posArray[j];
					String tempBreed = bArray[j];
					posArray[j] = posArray[i];
					bArray[j] = bArray[i];
					posArray[i] = tempInt;
					bArray[i] = tempBreed;
				}
			}
		}
	}

	public static void findFrame() {

	}

	public static void main(String args[]) throws IOException {
		// Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("fairphoto.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"fairphoto.out")));
		int n = in.nextInt();
		posArray = new int[n];
		bArray = new String[n];
		int g = 0, h = 0;
		int answer = 0;
		for (int i = 0; i < n; i++) {
			posArray[i] = in.nextInt();
			bArray[i] = in.next();
			if (bArray[i].equals("G")) {
				g++;
			} else {
				h++;
			}
		}
		sort();
		if (g == h || h == 0 || g == 0) {
			answer = posArray[n - 1] - posArray[0];
		} else {
			int maxAns = 0;
			for (int w = n - 2; w > 0 && maxAns == 0; w--) {
				for (int s = 0; s <= (n - 1) - w; s++) {
					int g2 = 0, h2 = 0;
					for (int d = 0; d <= w; d++) {
						if (bArray[s + d].equals("G")) {
							g2++;
						} else {
							h2++;
						}
					}
					if (g2 == h2) {
						if (posArray[s + w] - posArray[s] > maxAns) {
							maxAns = posArray[s + w] - posArray[s];
						}
					}

				}
			}
			answer = maxAns;
		}
		out.println(answer);
		out.flush();
	}

}