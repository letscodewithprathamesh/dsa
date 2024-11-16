package test4;

//print all substring from given String (all possible character combination)

public class Question63
{
	public static void main(String[] args) 
	{
		String s="abc";
		
		for(int i=0;i<s.length();i++)
		{
			String temp="";
			for(int j=i;j<s.length();j++)
			{
				temp=temp+s.charAt(j);
				System.out.println(temp);
			}
		}
		
	}
}
