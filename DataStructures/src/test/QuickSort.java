package test;

public class QuickSort {
	
	public static void main(String[] args) 
	{
		int nums[]= {10,18,2,4,7,3,8,9};
		
		
		
		System.out.println("Before Sorting ");
		for(int obj:nums)
		{
			System.out.print(obj+" ");
		}
		System.out.println();
		
		quickSort(nums,0,nums.length-1);
		
		
		System.out.println();
		System.out.println(" After Sorting ");
		for(int obj:nums)
		{
			System.out.print(obj+" ");
		}
		
	}

	private static void quickSort(int[] nums, int low, int high) {
		
		
		
		if(low<high)
		{
			int pi =partition(nums,high,low);
			quickSort(nums,low,pi-1);
			quickSort(nums,pi+1,high);
		}
		
	}

	private static int partition(int[] nums, int high, int low) {
		int pivot =nums[high];
		int i=low-1;
		
		
		for(int j=low;j<high;j++)
		{
			if(nums[j]<pivot)
			{
				i++;
				int temp=nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
			}
		}
		
		int temp=nums[i+1];
		nums[i+1]=nums[high];
		nums[high]=temp;
		
		
		
		return i+1;
	}

}
