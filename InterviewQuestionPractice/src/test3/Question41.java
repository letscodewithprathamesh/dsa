package test3;

// print 1 to 100 without using number 
//we use Alphabet because they are having ASCII value

public class Question41 
{
	public static void main(String[] args) 
	{
		//1 way
		int a='A'/'A'; //1
		
		String s1=".........."; // length = 10 , 10*10 = 100
		
		for(int i=a;i<=(s1.length()*s1.length());i++)
		{
			System.out.println(i);
		}
		
		// 'd' -> 100 ascii value of lower case d 
		
		for(int i=a;i<='d';i++)
		{
			System.out.println(i);
		}
		
		
		
	}

}
