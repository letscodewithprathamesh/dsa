package test;

public class Question4 
{
	public static void main(String[] args) 
	{
        String s1 = "iprograamer";
        String s2 = "iprogmteams";
        
        for (char c : s1.toCharArray()) 
        {
        	//here if conditions is like we are checking every character of String s1 present in String s2 . If the character is there then the condition will be true but we want Character which are not comman between them therefore we add !(Not) . which make it false.

            if (!s2.contains(Character.toString(c))) 
            {
                System.out.print(c + " ");
            }

        }
        
        for (char c : s2.toCharArray()) 
        {
        	//Same explanation but now we checking for s1 has every character of s2 . If not same then print them 
            if (!s1.contains(Character.toString(c))) {
                System.out.print(c + " ");
            }
        }
        
        

    
	}


}


/*
 * First take both the String
 * Convert String into Character Array by using toCharArray() mehtod 
 * This will help for Iteration over every character ... We will get every String Character into 
 * */
 