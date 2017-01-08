import java.util.*;
import java.io.*;

public class satpix
{
	static boolean [][] visited; 
	static int counter = 0;
	static char [][] space;
	static char right = '*';
	static int w;
	static int h;
	
	public static int floodfill(int r, int c, char right)
	{
		counter++;
		visited[r][c] = true;
		if (r-1>= 0 && r-1<h && c>=0 && c<w && space[r-1][c] == right && !visited[r-1][c] )
		{
			floodfill(r-1, c, right);
		}
		if (r>= 0 && r<h && c+1>=0 && c+1<w && space[r][c+1] == right && !visited[r][c+1])
		{
			floodfill(r, c+1, right);
		}
		if (r+1>= 0 && r+1<h && c>=0 && c<w && space[r+1][c] == right && !visited[r+1][c])
		{
			floodfill(r+1, c, right);
		}
		if (r>= 0 && r<h && c-1>=0 && c-1<w && space[r][c-1] == right && !visited[r][c-1])
		{
			floodfill(r, c-1, right);
		}
		return counter;
	}
	public static void main (String args []) throws IOException
	{
		Scanner in = new Scanner(System.in);
//		Scanner in = new Scanner(new File("satpix.in"));
//		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("satpix.out")));
		w = in.nextInt();
		h = in.nextInt();
		space = new char [h][w];
		visited = new boolean [h][w];
		in.nextLine();
		for (int row = 0; row<h; row++)
		{
			String temp = in.nextLine();
			for (int col = 0; col<w; col++)
			{
				space[row][col] = temp.charAt(col);
			}
		}
		int maxcounter = 0;
		for (int row = 0; row<h; row++)
		{
			for (int col = 0; col<w; col++)
			{
				if (space[row][col] == right && !visited[row][col])
				{
					floodfill(row, col, right);
				}
				if (counter > maxcounter)
				{
					maxcounter = counter;
					counter = 0;
				}
				counter = 0;
			}
			
		}
		System.out.println(maxcounter);
//		out.println(maxcounter);
//		out.flush();
			
		
		
	}
}
