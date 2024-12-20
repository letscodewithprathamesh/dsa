package test4;

//Reverse Every Word at its Original Position  Input="Java is Awesome" Output="avaJ si emosewA"

public class Question72 {

	public static void main(String[] args) {
		
		String s="Java is Awesome";
		
		System.out.println(s);
		
		reverseEachWord(s);
		
	}

	private static void reverseEachWord(String s) {
		String reverseString="";
		
		String words[]=s.split(" ");  // ["Java","is"..]
		
		for(int i=0;i<words.length;i++)
		{
			String word=words[i]; //"Java"
			String ch=" ";
			
			for(char c:word.toCharArray())
			{
				ch=c+ch;            //J+" " , a+J , v+aJ, a+vaJ , avaJ
			}
			
			reverseString=reverseString+ch;  //""+avaJ
			
		}
		
		System.out.println(reverseString);
		
	}
	
}
