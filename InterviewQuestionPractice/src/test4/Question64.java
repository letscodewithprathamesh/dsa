package test4;

//Find first Non-reapting character 


public class Question64 
{
	public static void main(String[] args) 
	{
		String s="aabccd";
		
		//getFirstNonRepeating(s);  // 1 st approach
		
		getfirstnonReapting(s);  // 2 nd approach

	}

	//1 st way second way
	 static void getFirstNonRepeating(String s)
	{
		 int length=s.length();
		 
		 for(int i=0;i<length;i++)
		 {
			 boolean unique=true;
			 for(int j=0;j<length;j++)
			 {
				 if(i!=j && s.charAt(i)==s.charAt(j))
				 {
					unique=false; 
					break;
				 }
			 }
			 
			 if(unique)
			 {
				 System.out.println(s.charAt(i)+" ");
				 break;
			 }
		 }
		
	}
	 
	 static void getfirstnonReapting(String s)
	 {
		for(char c:s.toCharArray())
		{
			if(s.indexOf(c) == s.lastIndexOf(c))
			{
				System.out.println(c);
				break;
			}
		}
		
	}
	 
	 
	 
	 

}
