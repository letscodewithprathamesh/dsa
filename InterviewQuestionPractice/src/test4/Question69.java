package test4;

import java.util.Arrays;

//Anagram of 2 String

public class Question69 
{
	public static void main(String[] args)
	{
		String s1="Listen";
		
		String s2="Silent";
		
		if(anagramCheck(s1,s2))
		{
			System.out.println("Both the Srings are Anagram");
		}
		else
		{
			System.out.println("Not an Anagram");
		}
		
	}

	 static boolean anagramCheck(String s1, String s2) {
		
		 if(s1.length() != s2.length())
		 {
			 return false;
		 }
		 
		 s1=s1.toLowerCase();
		 s2=s2.toLowerCase();
		 
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
	
		 return Arrays.equals(ch1, ch2);
	}

}