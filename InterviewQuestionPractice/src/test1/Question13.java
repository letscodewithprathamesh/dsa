package test1;

//gcd a=10 = 10*1 and b=20 = 10*2  therefore gcd is 10 . greatest comman divisor

public class Question13 {
	static int gcd(int a,int b)
	{
		//run while till b=0 and the value associated with a will be the result ,because we are using b to iterate and a which will store the value
		while(b != 0)
		{
			int temp = b;   
			b=a%b;
			//System.out.println(b);
			a=temp;  
		}
		
		return a;
	}
	
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		
		int result=gcd(a,b);
		
		System.out.println(result);
		
		
	}
}
