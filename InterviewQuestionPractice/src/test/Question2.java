package test;

import java.util.Scanner;

//Swapping without third variable

public class Question2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number 1 ");
		int data1=sc.nextInt();
		
		System.out.println("Enter the Number 2");
		int data2=sc.nextInt();
		
		System.out.println("Before Swapping of 2 Number ");
		System.out.println("Number 1 "+data1);
		System.out.println("Number 2 "+data2);
		
		data1=data1+data2;
		data2=data1-data2;
		data1=data1-data2;
		
		System.out.println("After Swapping of 2 Number ");
		System.out.println("Number 1 "+data1);
		System.out.println("Number 2 "+data2);
		
		
				
		
		sc.close();
		
	}
	
	
	
}


/*
 * Explanation , We are not using third variable to store data and then give it back to other element so what we are doing is
 * take the total of both number store it in one variable 
 * then take another variable minus the value from the total
 * take the variable in which you have store the total minus value from previous variable
 * 
 * refer example
 * 
 * */
