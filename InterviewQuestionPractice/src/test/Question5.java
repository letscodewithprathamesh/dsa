package test;

import java.util.Arrays;

public class Question5 
{
	public static void main(String[] args) 
	{
		
		int arr[]= {5,10,15};
	
		Arrays.sort(arr);
		
		int count=0;
		
		
		for(int i=0;i<arr.length-1;i++)
		{
			
			int a=arr[i];//5
			int b=arr[i+1];//10
			
			while(a != b) 
			{
				a++;
				count++;

				if(a==b) 
				{
					count--;
				}
			}

		}
		System.out.println(count);
		
	}

}


/*
 *  int arr[]={5,10,15};
 *  
 *  output : count: 8 
 *  
 *  Find the number between each and give the count
 * 
 * 
 * */
