package test4;

//java program to count the occurrences of each character using HashMap

import java.util.HashMap;
public class Question53 
{
	public static void main(String[] args) 
	{
		String name=" Hello  World ";
		
		getEachOccurance(name);
		
	}

	private static void getEachOccurance(String name) {
		
		HashMap<Character,Integer> charMap=new HashMap<Character , Integer>();
		
		char strArray[]=name.toCharArray();
		int spaceCount=0;
		for(char c: strArray)
		{
			//System.out.println(c);
			//!String.valueOf(c).isBlank() it will check if it contains space , if yes then leave it or make it false
			
			if(String.valueOf(c).isBlank())
			{
				spaceCount++;
			}
			else
			{
				if(charMap.containsKey(c))
				{
					charMap.put(c, charMap.get(c)+1);
				}
				else
				{
					charMap.put(c, 1);
				}
				
			}
		}
		
		System.out.println(name + ":"+charMap);
		
		System.out.println(" "+spaceCount);
		
		
	}

}
