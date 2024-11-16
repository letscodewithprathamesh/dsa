package test4;

// Remove Special Character from String

public class Question65
{
	public static void main(String[] args) 
	{
		String s="abc%2@kl#*#ABCD";
		
		//using built-in method  1 Approach
		System.out.println(s.replaceAll("[^a-zA-z0-9]", ""));  // pass regular expression and replace the regular expression with given String , We had given an regular expression leaving (^ which is Not) a-zA-Z0-9 replace all with empty String
		
		//2 nd Approach
		 String str = "Hello@# World!123"; // Example string with special characters
	     String cleanedStr = removeSpecialCharacters(str);
	     System.out.println("String without special characters: " + cleanedStr);

		
	}
	
	 public static String removeSpecialCharacters(String str) {
	        String result = ""; // To hold the cleaned string

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            // Check if the character is alphanumeric (a-z, A-Z, 0-9)
	            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
	                result += ch; // Add the character if it's alphanumeric
	            }
	        }

	        return result;
	    }

}
