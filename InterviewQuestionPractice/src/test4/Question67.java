package test4;

//length of last word of String

public class Question67 
{
	public static void main(String[] args) 
	{
		String s="All is Well ";
		
		char ch[]=s.toCharArray();
		
		int count=0;
		
		for(int i=ch.length-1;i>=0;i--)
		{
			
			if(ch[i] != ' ' )
			{
				count++;
			}
			else if(ch[i]==' ' &&  count != 0)
			{
				break;
			}
		}
		
		System.out.println("Length of Word "+count);
		
	}

}