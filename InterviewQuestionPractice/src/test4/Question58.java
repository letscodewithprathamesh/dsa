package test4;

//Sorting String Alphabetically

public class Question58 
{
	public static void main(String[] args)
	{
		String s="java";
		
		sortAlphabetically(s);
	}

	 static void sortAlphabetically(String s) 
	{
		char temp;

		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				//here we are comparing Ascii values of both character
				if(ch[i]>ch[j])  
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		
		for(char c:ch)
		{
			System.out.print(c);
		}
		
	}
}

