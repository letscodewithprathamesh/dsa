package test5;

import java.util.Arrays;

//Resize an Array 

public class Question79
{
	public static void main(String[] args) 
	{
		int arr[]= {10,34,65,67}; // arr length = 4
		
		//resize it by giving capacity
		
		int capacity=arr.length*2; // doubling the original array
		
		int result[]=resizeArray(arr,capacity);
		
		System.out.println(Arrays.toString(result));
		
	}

	 static int[] resizeArray(int[] arr, int capacity) 
	 {
		 int temp[]=new int[capacity];
		
		 //copy all the element from original array and keep it into temperory array and return remaing array.
		 for(int i=0;i<arr.length;i++)
		 {
			 temp[i]=arr[i];
		 }
		 
		return temp;
	}
}
