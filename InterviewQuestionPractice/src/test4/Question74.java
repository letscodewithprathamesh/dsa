package test4;

// input="AbcdGHIjkl" output "AGHI","bcdjkl"

public class Question74 {

	public static void main(String[] args) {
		
		String s="AbcdGHIjkl";
		
		String s1 ="";
		
		String s2="";
		
		for(char c:s.toCharArray())
		{
			if(c>='A' && c<='Z')
			{
				s1=s1+c;
			}
			else
			{
				s2=s2+c;
			}
		}
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
	
	
	
}
