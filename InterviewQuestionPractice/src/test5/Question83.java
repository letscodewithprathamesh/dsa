package test5;

import java.util.Arrays;

//Rotate Array element by k Tricky Question LeetCode

public class Question83 
{
	public static void main(String[] args)
	{
		
		int arr[]= {10,20,30,40,50};
		
		int k=2;
		
		//System.out.println(Arrays.toString(rotateArray(arr,k)));  //All in one Line doing same thing
		
		int result[]=rotateArray(arr, k);
		
		System.out.println(Arrays.toString(result));

	}

	private static int[] rotateArray(int[] arr, int k) 
	{
		int n=arr.length;
		
		reverse(arr,0,n-1);
		
		reverse(arr,0,k-1);
		
		reverse(arr,k,n-1);
	
		return arr;
	}

	private static void reverse(int[] arr, int start, int end) {
		
		
		
		while(start<=end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;		}
	}
	
}