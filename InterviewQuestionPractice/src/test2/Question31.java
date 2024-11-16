package test2;

public class Question31 
{
	public static void main(String[] args) 
	{
		int  n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

/*
 * the solution made up of three for loop -> first we need to make half pyramid and then just need to add from 2 row a normal pyramid
 * 
 * 1 st for loop -> space
 * 2 nd for loop -> print *
 * 3 rd for loop -> print *
 *  
 * */
