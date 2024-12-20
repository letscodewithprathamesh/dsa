package test4;

// input="string" output="rtsng"

public class Question66 
{
	public static void main(String[] args) 
	{
		String s="string";
		
		String result=new Question66().finalString(s); // 1 st approach
		
		System.out.println(result);
	}
	
	//1 st Approach
	 public String finalString(String s) 
	 {
	        StringBuilder t = new StringBuilder();  // StringBuilder is Mutable 
	        for (char c : s.toCharArray()) 
	        {
	            if (c == 'i') 
	            {
	                t.reverse();
	            } 
	            else 
	            {
	                t.append(c);
	            }
	        }
	        return t.toString();
	    }

}

/* 2 nd Approach - try  this in interview
 * public static void main(String[] args) 
	{
		String s="string";
		
		String output=new Question66().finalString(s);
		
		int length=s.length();
		
		System.out.println(output);
	}
	
	 public String finalString(String s)
	 {
		 String result="";
		 
	        for (char c : s.toCharArray()) 
	        {
	            if (c == 'i') 
	            {
	                int length=result.length();
	                
	                for(int i=length-1;i>=0;i--)
	                {
	                	result=result.charAt(i)+"";
	                }
	            } 
	            else 
	            {
	                result=result+c;
	            }
	        }
	        return result.toString();
	    }

 * 
 * */
