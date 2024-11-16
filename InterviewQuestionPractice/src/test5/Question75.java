package test5;

//sum of all element in array

public class Question75 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,10,11,20,30,30,40,50,60,10,50,20};
	
		sumOfAllElement(arr);

	}

	private static void sumOfAllElement(int[] arr) {
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.println(sum);
	}

}
