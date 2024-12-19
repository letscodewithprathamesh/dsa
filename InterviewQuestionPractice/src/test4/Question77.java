package test4;

import java.util.Scanner;

//reverse a String
public class Question77 {
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String to reverse");
		String input=sc.nextLine();
		
		char[] ch=input.toCharArray();  //String => 's','t','r','i','n','g'
		
		int length=ch.length;  //6
		
		reverseString(ch,length); // character array , 6
		
		sc.close();
		
	}

	private static void reverseString(char[] ch, int length) {
		
		if(length>0)
		{
			System.out.print(ch[length-1]);
			length--;
			reverseString(ch, length); // recurssive method calling
		}
		
		
	}

}
/*Pracrtice 
 * 
 * public class Question6
{
	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4};
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.println(sum);
		
	}

}
 * 
 * 
 * */
