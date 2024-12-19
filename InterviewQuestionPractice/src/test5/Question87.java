package test5;

import java.util.ArrayList;

//find union of 2 arrays Unsorted Array

public class Question87 {
	
	public static void main(String[] args) {
		
		int arr1[]= {1,2,2,1};
		int arr2[]= {2,3,3};
		
		ArrayList<Integer> output=union(arr1,arr2);
		
		System.out.println(output.toString());
		
	}

	private static ArrayList<Integer> union(int[] arr1, int[] arr2) {
		
		ArrayList<Integer> result=new ArrayList<Integer>();
		
		for(int a:arr1)
		{
			if(!result.contains(a))
			{
				result.add(a);
			}
		}
		
		for(int b:arr2)
		{
			if(!result.contains(b))
			{
				result.add(b);
			}
		}
		
		return result;
	}

}
