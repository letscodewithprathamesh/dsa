package test2;

// Pattern (Solid Rectangle) l=4 and b=5 , we can take any l and b from user and print accordingly, I have taken only one variable we can use more than one variable

public class Question21
{
	public static void main(String[] args) 
	{
		int n=5;
		
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}


/*
 * Nested for Loop for Pattern printing
 * 
 * 
 * Outer loop for Rows 
 * Inner Loop for Columns
 * 
 * print and println() both method plays cruical role in pattern problem
 * 
 * Trick look pattern problem using Matrix , row and column creates a  matrix 
 * 
 * public class Question21
{
	public static void main(String[] args) 
	{
		int n=4; //length
		
		int m=5; //breadth
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
 * 
 * While writing loop in pattern always try to start with i=1 and In Arrays start i=0 because starting index of array is 0 a[0]
 * 
 * */
 