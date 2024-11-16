package test2;

public class Question22 
{
	public static void main(String[] args) 
	{
		int n=4;
		
		int m=5;
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i == 1 || j == 1 || i == n || j == m)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

/*
 * It is same as Solid Rectangle but the only catch is with condition 
 * 
 * Solve it Imagining Matrix in your mind , my watching matrix we came to know that when matrix cell have value for i=1 which is 1 row it prints the pattern , j=1 it prints the pattern , i=n means i=4 it prints the pattern
 * so we add all the condition with help of OR operator , if any condition became true print it and we add else condition because when condition became false print space for Hollow 
 * 
 * 
 * */
