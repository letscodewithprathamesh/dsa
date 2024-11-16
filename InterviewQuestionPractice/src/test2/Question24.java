package test2;

public class Question24 
{
	public static void main(String[] args) 
	{
		int n=4;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}


/*
 * Another solution
 *package test2;

public class Question24 
{
	public static void main(String[] args) 
	{
		int n=4;
		
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
 */
 