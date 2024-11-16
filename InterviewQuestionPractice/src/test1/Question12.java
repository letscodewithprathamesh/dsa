package test1;

public class Question12
{
	public static void main(String[] args) 
	{
		int num=5;
		
		int fact=1;
		
		if(num>0)
		{
			for(int i=1;i<=num;i++)
			{
				fact=fact*i;
			}
			System.out.println(fact);
		}
		else
		{
			System.out.println("Negative Number Factorial cant be calculated");
		}
		
	}

}
