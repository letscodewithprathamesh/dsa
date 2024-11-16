package test4;

//removeDuplicate character from String

public class Question59
{
	
	public static void main(String[] args) 
	{
		
		
		String str="geeksforgeek";
		
		System.out.println(removeDuplicate(str));
		
		
	}
	
	public static String removeDuplicate(String str)
	{
		String result="";						// Use a plain string to build the result
		
		boolean seen[]=new boolean[256];		// To track seen characters
		
		// Traverse through all characters
		for(char c:str.toCharArray())
		{
			// Check if char c is present before it 
			if(!seen[c])
			{
				result=result+c;				// Append the character if not already seen
				seen[c]=true;					// Mark the character as seen
			}
		}
		
		return result;
	}

}

/* 
 * We had used boolean array for tracking duplicate . the array is by default false , if the character present make the character true .
 * 
 * 
 * how boolean array look like
 
seen[101] = true (for 'e')
seen[102] = true (for 'f')
seen[103] = true (for 'g')
seen[107] = true (for 'k')
seen[111] = true (for 'o')
seen[114] = true (for 'r')
seen[115] = true (for 's')
The value 256 represents the number of possible ASCII characters, which is why the array boolean[] seen = new boolean[256] is used in the code.The boolean array seen[] has a size of 256 to cover all possible ASCII values (0 to 255).
This means you can track the presence of any character in the extended ASCII set, not just the basic 128 characters.
*
*
*we can also use achieve this using hashset and Stringbuffer . Hashset for unique charcter and remove duplacate , StringBuffer to store final result .
*
*/
