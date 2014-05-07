import java.util.Random;

public class dice 
{
	int num1;
	int bounces;
	int num2;
	
	Random random = new Random();
	
	public dice(int num1)
	{
		this.num1=num1;
	}
	
	public int Throw()
	{
		num2 = random.nextInt(6)+1;
		return num2;
	}
	
	public int Throw(int num1)
	{
		for(int i=num1; i>0; i--)
		{
			num2 = num2 + random.nextInt(6)+1;
		}
		return num2;
	}
}
