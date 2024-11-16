package test4;

//Check and Count of vowels and consonants

public class Question51
{

	public static void main(String[] args) 
	{
		String name="Prathamesh";
		
		  int countVowels=0;
	      int countConsonants=0;
		
		int length=name.length();
		
		for(int i=0;i<length;i++)
		{
			if(isVowels(name.charAt(i)))
			{
				countVowels++;
			}
			else
			{
				countConsonants++;
			}
		}
		
		System.out.println("Vowels "+countVowels);
		
		System.out.println("Consonants "+countConsonants);
		
	}

	private static boolean isVowels(char ch) {
		
		ch=Character.toLowerCase(ch); 
		
		return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
	}

}