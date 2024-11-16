package test1;

import java.util.Scanner;

//ArmStrong Number

public class Question10 
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		int number=sc.nextInt();
		
		int sum=0;
		
		int rem=0;
		
		int ArmStrongNumber=isArmStrong(number,sum,rem);
		
		if(number == ArmStrongNumber)
		{
			System.out.println("Number is ArmStrong "+number);
		}
		else
		{
			System.out.println("Number is not ArmStrong Number");
		}
		
		
		
		sc.close();
		
	}

	private static int isArmStrong(int number, int sum, int rem) {
		
		
		while(number !=0)
		{
			rem = number%10;
			sum=sum+(rem*rem*rem);
			number=number/10;
		}
		
		
		
		return sum;
	}
	
}
