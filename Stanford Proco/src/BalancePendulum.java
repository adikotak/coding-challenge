import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BalancePendulum
{
	public static void main(String args[]) throws IOException
	{
		BufferedWriter bf = new BufferedWriter(new FileWriter("actions.txt"));
		String out = "";
		for (int angle = 0; angle<180; angle++)
		{
			for (int speed = -30; speed <= 30; speed++)
			{if (angle > 100 || (angle > 80 && angle < 90 && speed > 0)|| (angle > 80 && angle < 90 || speed < 0))
				{
					out = "R";
				}
				else if (angle < 80 || (angle > 80 && angle < 90 || speed > 0) || (angle > 80 && angle < 90 && speed < 0) )
				{
					out = "L";
				}
				else
				{
					out = "R";
				}
				bf.write(angle + " " + speed + " " + out + "\n");
			}
		}
//		for ( angle = 0; angle <= 29; angle++)
//		{
//			out = "R";
//			bf.write(angle + " " + speed + " " + out + "\n");
//		}
//		for (angle = 60; angle <=90; angle++)
//		{
//			speed = 90- angle;
//			out = "R";
//			bf.write(angle + " " + speed + " " + out + "\n");
//		}
//		for ( angle= 150; angle<=180; angle++)
//		{
//			speed = 150 - angle;
//			out = "L";
//			bf.write(angle + " " + speed + " " + out + "\n");
//		}
//		for (angle = 91; angle<=120; angle++)
//		{
//			speed = 91-angle;
//			out = "L";
//			bf.write(angle + " " + speed + " " + out + "\n");
//		}
//		for (angle = 30 ; angle<60; angle++)
//		{
//			out = "L";
//			bf.write(angle + " " + speed + " " + out + "\n");
//		}
//		for (angle = 121; angle<130; angle++)
//		{
//			out = "R";
//			bf.write(angle + " " + speed + " " + out + "\n");
//		}
	}
}
