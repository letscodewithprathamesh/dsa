package test;

public class MergeSort {
	public static void main(String[] args) 
	{
		int nums[]= {10,6,4,7,1,3,8,9};
		
		
		System.out.println("Before Sorting ");
		for(int obj:nums)
		{
			System.out.print(obj+" ");
		}
		System.out.println();
		
		
		mergeSort(nums,0,nums.length-1);
		
		
		
		
		System.out.println();
		System.out.println(" After Sorting ");
		for(int obj:nums)
		{
			System.out.print(obj+" ");
		}
		
	}

	private static void mergeSort(int[] nums, int left, int right)
	{
		if(left<right)
		{
			int mid=(left+right)/2;
			
			mergeSort(nums,left,mid);
			mergeSort(nums,mid+1,right);
			
			merge(nums,left,mid,right);
		}
		
	}

	private static void merge(int[] nums, int left, int mid, int right) {
		int n1=mid-left+1; // it gives size of array
		int n2=right-mid;
		
		int lArr[]=new int[n1]; //array1
		int rArr[]=new int[n2]; //array2
		
		for(int x=0;x<n1;x++)
		{
			lArr[x]=nums[left+x]; // Copy data into empty array from main array
		}
		
		for(int x=0;x<n2;x++)
		{
			rArr[x]=nums[mid+1+x]; // Copy data into empty array from main array
		}
		
		
		int i=0;
		int j=0;
		int k=left; //array index start from left with 0 index and k gradually increase
		
		while(i<n1 && j<n2) // actual merging
		{
			if(lArr[i]<=rArr[j])
			{
				nums[k]=lArr[i];
				i++;
			}
			else
			{
				nums[k]=rArr[j];
				j++;
			}
			k++;
		}
		
		while(i<n1)// remaining number merging from that particular array
		{
			nums[k]=lArr[i];
			i++;
			k++;
		}
		
		while(j<n2)// remaining number merging from that particular array
		{
			nums[k]=rArr[j];
			j++;
			k++;
		}
		
		
	}

}
