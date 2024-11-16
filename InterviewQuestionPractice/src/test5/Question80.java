package test5;

import java.util.Arrays;

// Operation over Array - delete an element

public class Question80 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,10,34,37,67,78,90};
		
		int element=37;
		
		int result[]=removeElement(arr,element);
		
		System.out.println(Arrays.toString(result));
	}

	 static int[] removeElement(int[] arr, int element) 
	{
		 int j=0;
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i] != element)
			 {
				 arr[j]=arr[i];	
				 j++;
			 }
		 }
		
		return arr;
	}

}
