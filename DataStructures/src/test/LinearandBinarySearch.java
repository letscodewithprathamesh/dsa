package test;

public class LinearandBinarySearch {
	
	public static void main(String[] args) {
		
		int nums[]= {4,7,9,12,15};
		
		int target=12;
		
		//int result = linearSerch(nums,target); // static method , we can also use non statc but after that we need to create Instance for it
		int result = binarySearch(nums,target);
		
		if(result != -1)
		{
			System.out.println("Element found at index "+result);
			System.out.println(" element "+nums[result]);
		}
		else
		{
			System.out.println("Element not Found");
		}
		
	}

	public static int binarySearch(int[] nums, int target) {
		
		int left=0;
		int right=nums.length-1;
		
		while(left<=right)
		{
			int mid=(left+right)/2;
			
			if(nums[mid]==target)
			{
				return mid;
			}
			else if(nums[mid]<target)
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
		}
		
		
		
		
		return -1;
	}

	public static int linearSerch(int[] nums, int target) 
	{
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i] == target)
			{
				return i;
			}
		}
		
		return -1;
	}

}
