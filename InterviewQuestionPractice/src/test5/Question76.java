package test5;

//Missing Number in a Array

public class Question76 
{
	public static void main(String[] args)
	{
		int arr[]= {1,3,4,6,7,5};
		
		int result=missingNumber(arr);
		
		System.out.println(result);
	}

	static int missingNumber(int[] arr) 
	{
		int n=arr.length+1;
		
		int sum=n*(n+1)/2;
		
		for(int num:arr)
		{
			sum=sum-num;
		}
		
		return sum;
	}
	
}


/*
 * int actualSum=0;
		
		//sum of all element in an array
		for(int value1:arr)
		{
			actualSum=actualSum+value1;
		}
		
		int expectedSum=0;
		
		//sum of element belongs to that range
		for(int i=arr[0];i<=arr[arr.length-1];i++)
		{
			expectedSum=expectedSum+i;
		}
		
		//difference between them is the missing Number
		System.out.println("Missing Number "+(expectedSum-actualSum));
 * 
 */