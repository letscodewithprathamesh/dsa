package test1;


//fibbonacci Series

public class Question11 
{
	
	public static void main(String[] args) 
	{
		int n=10;
		
		System.out.println("Enter the Series from where to start");
		
		
		int firstN = 0;
		int secondN = 1;
		
		for(int i=0;i<n;i++)
		{
			System.out.print(firstN+" ");  //0
			int thirdN = firstN + secondN; // 0+1 =1
		
			firstN =secondN; //1
			secondN=thirdN;  //1
		}
		
		
	}

}


/*
 * package test1;

//fibbonacci Series

public class Question11 
{
	
	public static void main(String[] args) 
	{
		int n=10;
		
		int firstN = 0;
		int secondN = 1;
		
		for(int i=0;i<n;i++)
		{
			System.out.print(firstN+" ");  //0, 1 , 1
			int thirdN = firstN + secondN; // 0+1 =1 , 1+1=2 , 1+2=3
		
			firstN =secondN; //1 , 1 , 2
			secondN=thirdN;  //1 ,2 , 3
		}

	}

}


with user input series

public class Question11 
{
	
	public static void main(String[] args) 
	{
		int n=10;
		
		System.out.println("Enter the Series from where to start");
		
		Scanner sc=new Scanner(System.in);
		
		int value=sc.nextInt();
		int firstN = value;
		int secondN = value+1;
		
		for(int i=0;i<n;i++)
		{
			System.out.print(firstN+" ");  //0
			int thirdN = firstN + secondN; // 0+1 =1
		
			firstN =secondN; //1
			secondN=thirdN;  //1
		}
		
		
	}

}



*/
