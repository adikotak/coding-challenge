import java.util.*;
import java.io.*;

public class crosswords
{
	static int n;
	static int m;
	
	public static boolean isOpen(char[][] cword, int i, int j)
	{
		return cword[i][j] == '.';
	}
	
	public static boolean aboveClosed (char cword [][], int i, int j)
	{
		return i-1<0 ||cword[i-1][j] == '#';
	}
	
	public static boolean belowTwoOpen (char cword[][], int i, int j)
	{
		return i+2 < n && cword[i+1][j] == '.' && cword[i+2][j] == '.'; 
	}
	
	public static boolean leftClosed (char cword [][], int i, int j)
	{
		return  j-1<0 || cword[i][j-1] == '#';
	}
	
	public static boolean rightTwoOpen (char cword[][], int i, int j)
	{
		return j+2 < m && cword[i][j+1] == '.' && cword[i][j+2] == '.';
	}
	
	public static boolean verticalTest(char [][] cword, int i, int j)
	{
		return (isOpen(cword, i, j) && aboveClosed(cword,i,j) && belowTwoOpen(cword,i,j));
	}
	
	public static boolean horizontalTest(char[][]cword, int i, int j)
	{
		return (isOpen(cword, i, j) && leftClosed(cword,i,j) && rightTwoOpen(cword,i,j));
	}
	
	public static void main (String args []) throws IOException
	{
		//Scanner in = new Scanner(System.in);
		 Scanner in = new Scanner(new File("crosswords.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("crosswords.out")));
		n = in.nextInt();
		m = in.nextInt();
		int counter = 0;
		char [][] crossword = new char [n][m];
		in.nextLine();
		for (int i = 0; i< n; i++)
		{
			String s = in.nextLine();
			for (int j = 0; j<m; j++)
			{
				crossword[i][j] = s.charAt(j);
				
			}
		}
		for (int i = 0; i< n; i++)
		{
			for (int j = 0; j<m; j++)
			{
				//vertical test
				if (verticalTest(crossword,i,j))
					counter++;
				
				//horizontal test
				if (!verticalTest(crossword,i,j) && horizontalTest(crossword,i,j))
					counter++;
			}
		}
		int [][] answer = new int [counter][2];
		int countrow = 0;
		for (int i = 0; i< n; i++)
		{
			for (int j = 0; j<m; j++)
			{
				//vertical test
				if (verticalTest(crossword,i,j))
				{
					answer[countrow][0] = i+1;
					answer[countrow][1] = j+1;
					countrow++;
				}
				
				//horizontal test
				if (!verticalTest(crossword,i,j) && horizontalTest(crossword,i,j))
				{
					answer[countrow][0] = i+1;
					answer[countrow][1] = j+1;
					countrow++;
				}

			}
		}
		out.println(counter);
		out.flush();
		for (int i = 0; i<counter; i++)
		{
			out.println(answer[i][0] + " " + answer[i][1]);
			out.flush();
		}
		
	}

}
