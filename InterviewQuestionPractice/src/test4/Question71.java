package test4;

//Replacing a Substring  in String

public class Question71 
{
	public static void main(String[] args) 
	{
		String s="My name is nana and nana is Boss";
		
		String s1="nana";
		
		String s2="NANA";
		replaceSubstring(s,s1,s2);
	}

	private static void replaceSubstring(String s, String s1, String s2)
	{
		String word[]=s.split(" ");
		
		String result="";
		
		for(int i=0;i<word.length;i++)
		{
			if(word[i].contains(s1))
			{
				result=result+s2+" ";
			}
			else
			{
				result=result+word[i]+" ";
			}
		}
		
		System.out.println(result);
		
	}

}
