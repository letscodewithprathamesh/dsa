package test;

public class SelectionSort
{

	
	
	public static void main(String[] args) 
	{
		int nums[]= {10,18,2,4,7,3,8,9};
		int size= nums.length;
		int temp=0;
		int minIndex=-1;
		
		System.out.println("Before Sorting ");
		for(int obj:nums)
		{
			System.out.print(obj+" ");
		}
		System.out.println();
		
		for(int i=0;i<size-1;i++ )
		{
			for(int j=i+1;j<size;j++)
			{
				minIndex=i;
				if(nums[j] < nums[minIndex])
				{
					minIndex=j;
				}
				
				temp=nums[minIndex];
				nums[minIndex]=nums[i];
				nums[i]=temp;
				
				System.out.println();
				for(int obj:nums)
				{
					System.out.print(obj+" ");
				}
				
				
				
				
			}
			
		}
		
		System.out.println();
		System.out.println(" After Sorting ");
		for(int obj:nums)
		{
			System.out.print(obj+" ");
		}
		
		
	}



}
