package test1;

//Count Number of Digit from given Number

public class Question22 
{
	public static void main(String[] args)
	{
		int num=1234;
		
		int digit=0;
		
		while(num>0)
		{
			num=num/10;
			digit++;
		}
		
		System.out.println("Digit in Number"+digit);
		
	}

}
