package test4;

//Remove white Space from String

public class Question54 
{
	public static void main(String[] args) 
	{
		String s="a bc dd ef ";
	
		System.out.println(removeWhiteSpace(s));

	}

	 static String removeWhiteSpace(String s)
	 {
			String result="";
			
			for(char c:s.toCharArray())
			{
				if(c != ' ')
				{
					result=result+c;
				}
			}
		return result;
	}
	
	
	

}
