package test5;

import java.util.Arrays;

//remove Duplicate elements from Array for sorted Array . for Unsorted just use built-in method Arrays.sort(arr)

public class Question74 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,10,11,20,30,30,40,50,60,10,50,20};
	
		removeDuplicateElement(arr);

	}

	 static void removeDuplicateElement(int[] arr) 
	 {
		 Arrays.sort(arr);
		 
		 int j=0; // Unique element index in given Array
		 
		 for(int i=0;i<arr.length-1;i++)
		 {
				 if(arr[i] != arr[i+1])
				 {
					 arr[j++]=arr[i];
				 }
			 
		 }
		 
		 arr[j++]=arr[arr.length-1];
		 
		 //System.out.println(j); // Index of J 
		 
		for(int k=0;k<j;k++)
		{
			System.out.println(arr[k]);
		}
		 
		
	}

}

/*
 * I used this way to find answer . But the integer values are small therefore it wont affect in starting But Integer greater than 256 it Cant handle for that we Alternative way of using HashSet which store only unique element.
 * package test5;

import java.util.ArrayList;
import java.util.Arrays;


//It works well with sorted and Unsorted Array
public class Question74 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,10,11,20,30,30,40,30, 30, 20, 10, 20, 50, 10};
	
		removeDuplicateElement(arr);

	}

	 static void removeDuplicateElement(int[] arr) 
	 {
	
		 boolean seen[]=new boolean[256];
		 
		 ArrayList<Integer> arr1=new ArrayList<Integer>();
		 
		 
		 for(int i:arr)
		 {
			 if(!seen[i])
			 {
				 arr1.add(i);
				 seen[i]=true;
			 }
		 }
		 
		 System.out.println(arr1);
		
	}

}



//Works on Sorted Element
 * 
 *  static void removeDuplicateElement(int[] arr) 
	 {
		 
		 int temp[]=new int[arr.length];  // add an empty array with given array length
		
		 int j=0; // used for unique element index , at this index we will store unique element in temp [] array . Using this we are avoiding using two loops
		 
		 for(int i=0;i<arr.length-1;i++)
		 {
				 if(arr[i] != arr[i+1]) // whenever two adjacent element are different then only it became true . if adjacent element they are equal condition will become false and shift to next index of given array
				 {
					 temp[j++]=arr[i]; // first we are adding element at j index of temp array and then increamenting then j++ . like for j=0 10 , j=1 11 ...
				 }
			 
		 }
		 
		 temp[j++]=arr[arr.length-1]; // last element is not compared therefore we add directly to temp array
		 
		 
		 
		for(int k=0;k<j;k++)
		{
			System.out.println(arr[k]);
		}
		 
		 
		 
		 
		 
	}

 * */
