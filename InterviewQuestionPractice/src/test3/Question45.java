package test3;

//Print next 5 alphabest , input=W output=XYZab

public class Question45 
{
	public static void main(String[] args) 
	{
		char input='W';
		
		for(int i=1;i<=5;i++)
		{
			char charNext=(char)(input+i);
			System.out.println(charNext);
			
		}
		
		
	}

}
