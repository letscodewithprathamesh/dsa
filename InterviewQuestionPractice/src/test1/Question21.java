package test1;

//Find Perfect Number

public class Question21 {
	
	public static void main(String[] args) {
		
		int num=20;
		
		int i=1;
		
		int sum=0;
		
		//using while we will itrate from i to num and we check if  num % i == 0,whether num is divisible by i without a remainder , if any value is there in remainder which means the number is not fully divisible by that number therefore we use it 
		//thwn just sum all the i values using temp variable and increament i
		while(i<num)
		{
			if(num%i == 0)
			{
				sum=sum+i;
			}
			i++;
		}
		
		if(num == sum)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not a perfect Number");
		}
		
		
	}
	

}
