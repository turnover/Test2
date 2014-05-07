import java.util.Scanner;

public class GuessDice 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		double num3;
		
		System.out.println("How many dices would you like to throw?");
		num1 = input.nextInt();
		dice dice = new dice(num1);
		
		System.out.println("Please guess the total amount the dices have landed on: ");
		num2 = input.nextInt();
		
		dice.Throw(num1);
		
		num3 = dice.num2;
		
		if(num2 <= num3*1.1 && num2 >= num3*0.9)
		{
			System.out.println("You have guessed right. CONGRATULATIONS!");
		}
		else
		{
			System.out.println("You have guessed wrong. Please play again.");
		}
		
		
	}

}
