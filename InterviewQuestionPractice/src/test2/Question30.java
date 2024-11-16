package test2;

public class Question30 
{
	public static void main(String[] args) 
	{
		int n=5;
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<n-i+1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}

}

/*package test2;

public class Question30 
{
	public static void main(String[] args) 
	{
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<n-i+1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}

}

public static void main(String[] args) 
	{
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=1;j--)
			{
				if(j>i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*"+" ");
				}
			}
			
			System.out.println();
		}
		
	}

*/
