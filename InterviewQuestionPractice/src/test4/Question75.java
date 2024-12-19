package test4;
//Extract Integer from String in java and give count of it and give sum of there no also

import java.util.Scanner;

public class Question75 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String with Number ");
		
		String data=sc.next();
		
		integerfromString(data);
		
		sc.close();
		
	}

	private static void integerfromString(String data) {
		
		int size=data.length(); 
		
		int count=0;
		
		int sum=0;
		
		for(int i=0;i<size;i++)
		{
			char ch=data.charAt(i);
			
			//System.out.println(ch);
			
			if(Character.isDigit(ch))
			{
				System.out.print(ch+" ");
				sum +=Integer.parseInt(""+ch);
				count ++;
			}
		}
		
		System.out.println();
		
		System.out.println("Sum of Integer "+sum);
		
		System.out.println("Count of Integer "+count);
		
	}
}
