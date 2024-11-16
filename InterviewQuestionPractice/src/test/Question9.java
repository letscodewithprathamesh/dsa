package test;

// Find Number is Palindrome or Not

public class Question9 
{
	public static void main(String[] args) 
	{
		int num=121;
		int rem=0;
		int reverse=0;
		reverse=palindromeNumber(num,rem,reverse);
		
		if(num == reverse)
		{
			System.out.println("Number is Palindrome "+num);
		}
		else
		{
			System.out.println("Number is Not Palindrome "+num);
		}
		
	}

	private static int palindromeNumber(int num,int rem,int reverse) {
	
		while(num != 0)
		{
			rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
		
		return reverse;
		
	}
}



/*
 * we can shorten the code using Boolean method
 * 
 * public static void main(String[] args) 
	{
		int num=121;
		int rem=0;
		int reverse=0;
		
		if(palindromeNumber)
		{
			System.out.println("Number is Palindrome "+num);
		}
		else
		{
			System.out.println("Number is Not Palindrome "+num);
		}
		
	}

	private static boolean palindromeNumber(int num,int rem,int reverse) {
	
		while(num != 0)
		{
			rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
		
		return num == reverse;
		
	}
 * 
 * 
 * */
