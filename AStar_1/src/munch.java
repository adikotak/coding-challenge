import java.util.*;
import java.io.*;

public class munch
{
	public class point
	{
		public int x;
		public int y;

		public point(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String args[]) throws IOException
	{
		Queue<point> q = new LinkedList<point>();
//		Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("munch.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("munch.out")));
		int r = in.nextInt();
		int c = in.nextInt();
		int tempr;
		int tempc;
		char start = 'B';
		char end = 'C';
		char right = '.';
		char[][] grid = new char[r][c];
		String spam = in.nextLine();
		boolean[][] visited = new boolean[r][c];
		for (int i = 0; i < r; i++)
		{
			String inTemp = in.nextLine();
			for (int j = 0; j < c; j++)
			{
				grid[i][j] = inTemp.charAt(j);
			}
		}
		int pos1 = -1;
		int pos2 = -1;
		for (int i = 0; i < r; i++)
		{
			for (int j = 0; j < c; j++)
			{
				if (grid[i][j] == start)
				{
					pos1 = i;
					pos2 = j;
					break;
				}
			}
			if (pos1 >= 0 && grid[pos1][pos2] == start)
			{
				break;
			}
		}
		q.add(new munch().new point(pos1, pos2));
		visited[pos1][pos2] = true;
		int dist[][] = new int[r][c];
		dist[pos1][pos2] = 0;
		while (q.size() > 0)
		{
			point temp = q.remove();
			tempr = temp.x;
			tempc = temp.y;
			if (grid[tempr][tempc] == end)
			{
//				System.out.println(dist[tempr][tempc]);
				out.println(dist[tempr][tempc]);
				out.flush();
				break;
			}
			/**
			 * going right
			 */
			if (tempr >= 0 && tempr < r && tempc + 1 >= 0 && tempc + 1 < c && grid[tempr][tempc + 1] == right && !visited[tempr][tempc + 1])
			{
				q.add(new munch().new point(tempr, tempc + 1));
				visited[tempr][tempc + 1] = true;
				dist[tempr][tempc+1] = 1+ dist[tempr][tempc];

			}
			/**
			 * going down
			 */
			if (tempr + 1 >= 0 && tempr + 1 < r && tempc >= 0 && tempc < c && grid[tempr + 1][tempc] == right && !visited[tempr + 1][tempc])
			{
				q.add(new munch().new point(tempr + 1, tempc));
				visited[tempr + 1][tempc] = true;
				dist[tempr+1][tempc] = 1+ dist[tempr][tempc];
			}
			/**
			 * going up
			 */
			if (tempr - 1 >= 0 && tempr - 1 < r && tempc >= 0 && tempc < c && grid[tempr - 1][tempc] == right && !visited[tempr - 1][tempc])
			{
				q.add(new munch().new point(tempr - 1, tempc));
				visited[tempr - 1][tempc] = true;
				dist[tempr-1][tempc] = 1+dist[tempr][tempc];
			}
			/**
			 * going left
			 */
			if (tempr >= 0 && tempr < r && tempc-1 >= 0 && tempc-1 < c && grid[tempr][tempc-1] == right && !visited[tempr][tempc -1])
			{
				q.add(new munch().new point(tempr, tempc-1));
				visited[tempr][tempc-1] = true;
				dist[tempr][tempc-1] = 1+dist[tempr][tempc];
			}
			
			/**
			 * END SECTION
			 */
			if (tempr >= 0 && tempr < r && tempc + 1 >= 0 && tempc + 1 < c && grid[tempr][tempc + 1] == end && !visited[tempr][tempc + 1])
			{
				q.add(new munch().new point(tempr, tempc + 1));
				visited[tempr][tempc + 1] = true;
				dist[tempr][tempc+1] = 1+ dist[tempr][tempc];

			}
			/**
			 * going down
			 */
			if (tempr + 1 >= 0 && tempr + 1 < r && tempc >= 0 && tempc < c && grid[tempr + 1][tempc] == end && !visited[tempr + 1][tempc])
			{
				q.add(new munch().new point(tempr + 1, tempc));
				visited[tempr + 1][tempc] = true;
				dist[tempr+1][tempc] = 1+ dist[tempr][tempc];
			}
			/**
			 * going up
			 */
			if (tempr - 1 >= 0 && tempr - 1 < r && tempc >= 0 && tempc < c && grid[tempr - 1][tempc] == end && !visited[tempr - 1][tempc])
			{
				q.add(new munch().new point(tempr - 1, tempc));
				visited[tempr - 1][tempc] = true;
				dist[tempr-1][tempc] = 1+dist[tempr][tempc];
			}
			/**
			 * going left
			 */
			if (tempr >= 0 && tempr < r && tempc-1 >= 0 && tempc-1 < c && grid[tempr][tempc-1] == end && !visited[tempr][tempc -1])
			{
				q.add(new munch().new point(tempr, tempc-1));
				visited[tempr][tempc-1] = true;
				dist[tempr][tempc-1] = 1+dist[tempr][tempc];
			}
			
		}
	}

}

