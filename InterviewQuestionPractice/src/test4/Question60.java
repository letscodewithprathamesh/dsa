package test4;

//removeDuplicate character from String (2 nd Way)

public class Question60
{
	
	  public static String removeDuplicates(String str) {
		    
		    String result = "";

		    for(int i=0; i<str.length(); i++) 
		    {
		      char ch = str.charAt(i);
		      
		      if(result.indexOf(ch) == -1) //here we takes empty string and use indexOf() on it and check if that character is present or not , if not it will return -1 .
		      {
		    	  result += ch;
		      }
		      }
		    			return result;
		    }
		    
	  			
		  

		  public static void main(String[] args) {
		    String input = "Hello World";
		    String output = removeDuplicates(input);
		    System.out.println(output);
		  }

}
/*Example Run:
For the input "Hello World", the method works as follows:

First iteration (i = 0, ch = 'H'):

'H' is not in result, so result = "H".
Second iteration (i = 1, ch = 'e'):

'e' is not in result, so result = "He".
Third iteration (i = 2, ch = 'l'):

'l' is not in result, so result = "Hel".
Fourth iteration (i = 3, ch = 'l'):

'l' is already in result, so nothing is added.
Fifth iteration (i = 4, ch = 'o'):

'o' is not in result, so result = "Helo".
And similarly for the rest of the characters.

At the end, the result string becomes "Helo Wrd", with all duplicates removed.

If the character is present more than once, indexOf() will only return the index of the first occurrence.

Let’s say result = "Hello World" and we call indexOf('l'):

'l' appears multiple times, but indexOf('l') will return the index of the first 'l' which is at index 2.

If the character is present, indexOf(ch) returns the first index where the character appears.
If the character is not present, indexOf(ch) returns -1.







*/



