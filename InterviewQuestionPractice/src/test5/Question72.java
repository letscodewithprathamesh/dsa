package test5;

public class Question72 
{
	public static void main(String[] args)
	{
		int arr[]= {4,7,1,10,8};
		
		findLargestandSmallest(arr);
	}

	 static void findLargestandSmallest(int[] arr) 
	 {
		 int min=arr[0];
		 int max=arr[0];
		 
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i]) //4<4 ,4<7,7<1,7<10,10<8
			{
				max=arr[i];
			}
			else
			{
				if(min>arr[i]) //4>4 ,4>1,1>8
				{
					min=arr[i];
				}
			}
		}
		
		System.out.println("Largest "+max+" Smallest "+min);
		
	 }

}
