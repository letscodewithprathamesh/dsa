package test4;

//print one letter Twice of given String input ="hello" output="hheelllloo"

public class Question73 {

	public static void main(String[] args) {
		String s="hello";
		
		String result="";
		
		for(char ch:s.toCharArray())
		{
			result=result+ch+ch;
		}
		
		System.out.println(result);
	}
	
}
