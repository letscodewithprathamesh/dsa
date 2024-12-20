package test5;

import java.util.Arrays;

public class Question86 {
    public static void main(String[] args) {
        int arr1[] = {1, 4, 6};
        int arr2[] = {2, 3, 5};

        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        
    	int n=arr1.length+arr2.length;
    	
    	int result[]=new int[n];
    	
    	int i=0 ,j=0,k=0;
    	
    	//we are adding small elements into result array and handling the pointer using while loop
    	while(i<arr1.length && j<arr2.length)
    	{
    		if(arr1[i]<arr2[j])
    		{
    			result[k]=arr1[i];
    			i++;
    			k++;
    		}
    		else
    		{
    			result[k]=arr2[j];
    			j++;
    			k++;
    		}
    	}
    	
    	//remaining element of array into result array
    	while(i<arr1.length)
    	{
    		result[k]=arr1[i];
    		i++;
    		k++;
    	}
    	
    	//remaining element of array into result array
    	while(j<arr2.length)
    	{
    		result[k]=arr1[j];
    		j++;
    		k++;
    	}
    	
    	return result;
    }
}


/*
 *  take an empty array of length combined of both the arrays
 *  take 3 pointer i,j and k
 *  use i and j for 2 sorted arrays and k for indexing of result array(empty array)
 *  compare and add smaller element into empty array and then add remaining element from both the array into empty element
 * we will be using for loop
 * */
