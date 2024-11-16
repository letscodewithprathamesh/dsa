package test;

import java.util.Scanner;

//Sum of digit of given Numbers

public class Question1 
{
	
	public static int sum(int data)
	{
		int sum=0;
		
		while(data !=0 )
		{
			sum = sum+data%10;   //we use to  fetch particular data and add data to temp variable and get the sum of all digit of a number
			data=data/10;       //just by dividing 10 we are removing each element from backward of the number like  number is 143 then first it will remove 3 then 4 then 1 and then it will become zero and loop will end
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number ");
		int data=sc.nextInt();
		
		
		int result = sum(data);

		System.out.println(result);
		
		
		sc.close();
	}
}

/*
 * Explaination 
 * 
 * eg data = 121 
 * 
 * set a temp variable sum=0
 * 
 * write a while() , we use while condition where we have to verify some condition but we dont have endpoints for it and write a condition such a way after fullfilling the condition becames false
 * 
 * in while condition
 * sum=sum+data%10;
 * using % mod of 10 we are able to access last digit of number . the remainder will be alway the last digit of the number
 * 
 * first loop ,121 !=0 true , sum=0 + 1 =>sum=1
 *				data=121/10 = 12.1 =12 it ignores float values
 *while second loop , 12!=0 , true sum=1 + 2 =>sum=3
 *				data=12/10 = 1 =1
 *while third loop , 1!=0 , true sum=3 + 1 =>sum=4
 *				data=1/10 = 0 
 *while fourth loop , 0!=0 false , loop end and return answer
 *
 * 
 * 
 * 
 * */


/*
 * Like this we can do for set of number like taking last 2 digit of every number and add them this is the example
 * package test;

import java.util.Scanner;

//Sum of digit of given Numbers

public class Question1 
{
	
	public static int sum(int data)
	{
		int sum=0;
		
		while(data !=0 )
		{
			sum = sum+data%100;   //we use to  fetch particular data and add data to temp variable and get the sum of all digit of a number
			data=data/100;       //just by dividing 10 we are removing each element from backward of the number like  number is 143 then first it will remove 3 then 4 then 1 and then it will become zero and loop will end
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number ");
		int data=sc.nextInt();
		
		
		int result = sum(data);

		System.out.println(result);
		
		
		sc.close();
	}

}

 * */
 