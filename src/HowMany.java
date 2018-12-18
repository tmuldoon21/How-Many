import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Tyler Muldoon
 * How Many
 *
 */
public class HowMany 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.print("Please enter the number of times you want to roll the dice: ");
		int roll = user.nextInt();
		Random ran = new Random();
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0; 
		for (int i = 0; i < roll; i++)
		{
			int rand = ran.nextInt(6) + 1;
			
			if (rand == 1)
			{
				one ++;
			}
			if (rand == 2)
			{
				two ++;
			}
			if (rand == 3)
			{
				three ++;
			}
			if (rand == 4)
			{
				four ++;
			}
			if (rand == 5)
			{
				five ++;
			}
			if (rand == 6)
			{
				six ++;
			}
			
		}
		System.out.println("The amount of time you rolled the number one is " + one);
		System.out.println("The amount of time you rolled the number two is " + two);
		System.out.println("The amount of time you rolled the number three is " + three);
		System.out.println("The amount of time you rolled the number four is " + four);
		System.out.println("The amount of time you rolled the number five is " + five);
		System.out.println("The amount of time you rolled the number six is " + six);
	}

}
