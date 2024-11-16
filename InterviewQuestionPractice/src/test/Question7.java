package test;

// Prime Numbers

public class Question7 
{
	public static void main(String[] args) {
		
		System.out.println("Prime Numbers ");
		
		int i,j,s;
		
		for(i=2;i<100;i++)
		{
			s=0;
			for(j=2;j<i;j++)
			{
				
				if(i%j==0)
				{
					s=1;
					break;
				}
				
			}
			
			if(s==0)
			{
				System.out.print(i+" ");
			}
		}
		
		
	}

}


//Here s place the role of condition which will print prime number , if s==0 then prime and s==1 non-prime dont print it
