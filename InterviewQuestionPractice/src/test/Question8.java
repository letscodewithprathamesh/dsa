package test;

//reverse a number

public class Question8 
{
	public static void main(String[] args)
	{
		int num=123;
		System.out.println(num);
		
		
		reverseNumber(num);
	
		
	}

	private static void reverseNumber(int num) {
	
		int reverse=0;
		
		while(num != 0)
		{
			reverse=num%10;
			System.out.print(reverse);
			num=num/10;
		}
		
	}

}

/*
 * We can also do it using for loop for accessing the number like
 * 
 * int num=123;
 * for(;num!=0;num=num/10)
 * {
 * }
 * 
 * the loop will iterate till the condition becomes false and increament such as num=num/10
 * 
 * */
