package test5;

import java.util.HashSet;

//Find Common elements from 2 Array

public class Question85 {
	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {4,6,5,7,8,9};
		
		commonElements(arr1,arr2); //Approach 1
		commonElements1(arr1,arr2);
	}

	//Approach1
	private static void commonElements(int[] arr1, int[] arr2) 
	{
		for(int i:arr1)
		{
			for(int j:arr2)
			{
				if(i == j)
				{
					System.out.print(i+" ");
				}
			}
		}
	}
	
	//Approach2 
	private static void commonElements1(int[] arr1, int[] arr2) 
	{
		HashSet<Integer> set=new HashSet<Integer>();
		HashSet<Integer> common=new HashSet<Integer>();
	
		
		for(int nums:arr1)
		{
			set.add(nums);
		}
		
		for(int nums2 :arr2)
		{
			if(set.contains(nums2))
			{
				common.add(nums2);
			}
		}
		
		System.out.println(common.toString());
	}

}
