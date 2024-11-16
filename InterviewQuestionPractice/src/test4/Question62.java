package test4;

//Count of the sum of Number from String

public class Question62 
{
	public static void main(String[] args) 
	{
		String s="1nanaPra0thme3sh01";
		
		int sum=0;
		
		for(char c:s.toCharArray())
		{
			if(Character.isDigit(c))
			{
				sum=sum+(c-'0');  //as the character contain the ascii value it start from 0 . for 0 it is 48 ...we are reducing that much value from it and giving the integer value ,therefore we also didnt need type casting for char to int;
				//  0+(49-48)=1     '0'=48  '1'=49 
			}
		}
		
		System.out.println("Sum of Number from String "+sum);
	}

}
