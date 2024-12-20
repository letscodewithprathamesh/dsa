package test5;

import java.util.Arrays;

//Mean and Median of an Array

public class Question84 
{
	public static void main(String[] args) {
		int arr[]= {1,4,76,8,9};

		int n=arr.length;
		
		Arrays.sort(arr);
		
		meanofelements(arr,n);
		
		medianofElements(arr,n);
	}

	private static void meanofelements(int[] arr, int n) 
	{
		float sum=0;
		
		for(int i:arr)
		{
			sum=sum+i;
		}
		
		float result= sum/n;
		
		System.out.println(result);
	}
	
	private static void medianofElements(int[] arr, int n) 
	{	
		double median;
		
		if(n%2 == 0)
		{
			median = (arr[(n/2)-1]+arr[n/2])/2.0;
		}
		else
		{
			median=arr[n/2];
		}
		
		System.out.println(median);
		
	}
	
}
