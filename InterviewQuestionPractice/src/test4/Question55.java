package test4;

//Find First Repeating character from String

public class Question55 
{
	public static void main(String[] args) 
	{
		String name="Prpthamesh";
		
		System.out.println(firstOccranceofString(name));
		
	}

	private static String firstOccranceofString(String name) {
	
		int size=name.length(); //10
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(name.charAt(i) == name.charAt(j))
				{
					return Character.toString(name.charAt(i)); //Character Object which contains toString() which return particular character not a String therefore give the present character.
				}
			}
		}
		
		
		return "-1";
	}
}
