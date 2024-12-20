package test4;

//Toggle the String

public class Question68 
{
	public static void main(String[] args) 
	{
		String s="N@Na";
		
		char ch[]=s.toCharArray();
		
		//Approach 1 
		ToggleCharacter(ch);
		
		ToggleCharacter2(ch);
	}

	//Approach 1
	 static void ToggleCharacter(char[] ch) 
	 {
		 String result="";
			
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]>='A' && ch[i]<='Z')
				{
					result=result+(char)(ch[i]+32); // A =65 and a=97 , 'a'-'A'=32 , therefore we want to lowercase the value from given character we add 32
				}
				else if(ch[i]>='a' && ch[i]<='z')
				{
					result=result+(char)(ch[i]-32); // to UpperCase ,therefore we subrtract from given character
				}
				else
				{
					result=result+ch[i];
				}
			}
			
			System.out.println(result);
	}
	 
	 //Approach 2
	  static void ToggleCharacter2(char[] ch)
	  {
		  StringBuilder result=new StringBuilder();
		  
		  for(int i=0;i<ch.length;i++)
			{
				if(ch[i]>='A' && ch[i]<='Z')
				{
					result.append(Character.toLowerCase(ch[i]));				}
				else if(ch[i]>='a' && ch[i]<='z')
				{
					result.append(Character.toUpperCase(ch[i]));
				}
				else
				{
					result.append(ch[i]);
				}
			}
			
			System.out.println(result.toString());
	  }


}
