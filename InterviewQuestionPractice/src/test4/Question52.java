package test4;

// Print first letter of ever Word of the String

public class Question52 
{
	public static void main(String[] args) 
	{
		String str="My Name is Prathamesh Sadashiv Yadav";
		
		String word[]=str.split(" "); // 'My','Name' ,.... 
		
		for(int i=0;i<word.length;i++)
		{
			
			String result = word[i]; // My
			
			System.out.println(result.charAt(0)); //M
			
		}
		
	}

}
