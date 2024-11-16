package test;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int nums[]= {4,7,3,8,9};
		int size= nums.length;
		int temp=0;
		
		System.out.println("Before Sorting ");
		for(int obj:nums)
		{
			System.out.print(obj);
		}
		System.out.println();
		
		for(int i=0;i<size;i++ )
		{
			for(int j=i+1;j<size;j++)
			{
				if(nums[j] < nums[i])
				{
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
			
		}
		
		System.out.println();
		System.out.println(" After Sorting ");
		for(int obj:nums)
		{
			System.out.print(obj);
		}
		
		
		
	}}
