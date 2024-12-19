package test5;

import java.util.ArrayList;

//Intersection of two arrays with duplicates and Unsorted

public class Question88 {

	public static void main(String[] args) {
		
		int arr1[]= {1,2,2,1};
		int arr2[]= {2,3,1};
		
		ArrayList<Integer> output=intersection(arr1,arr2);
		
		System.out.println(output.toString());
		
		
	}

	private static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
		
		ArrayList<Integer> result=new ArrayList<Integer>();
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					if(!result.contains(arr1[i]))
					{
						result.add(arr1[i]);
					}
				}
			}
		}
		
		
		
		return result;
	}
	
	
}
