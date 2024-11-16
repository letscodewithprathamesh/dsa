package test3;

// print 1 to 100 without using any loop
// recurrsive function 

public class Question42 
{
	public static void main(String[] args)
	{
		int n=1;
		
		recurrsive(n);
		
	}

	private static void recurrsive(int n) {
		
		if(n<=100)
		{
			System.out.println(n);
			recurrsive(n+1);
		}
		
		
	}

}
