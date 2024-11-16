package test4;

public class Question56 
{
	
	public static void main(String[] args) 
	{
		String str="MOM";
		
		int size=str.length();
		
		String rev="";
		
		
		
		for(int i=size-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(str.equals(rev))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		
	}

}
