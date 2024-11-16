package test;

public class InsertionSort {
	
	

	public static void main(String[] args) {
		
		int nums[]= {10,3,13,9,7};
		
		 int size=nums.length;
		
		int key =0;
		
		System.out.println("Before Sorting ");
		for(int obj:nums)
		{
			System.out.print(obj+" ");
		}
		System.out.println();
		
		
		for(int i=1;i<size;i++)
		{
			key=nums[i];
			int j=i-1;
			System.out.println(j);
			
			while(j>=0 && nums[j]>key)
			{
				nums[j+1]=nums[j];
				
				j=j-1;
				System.out.println(j);
			}
			System.out.println(j);
			
			nums[j+1]=key;
		}
		
		
		
		System.out.println();
		System.out.println(" After Sorting ");
		for(int obj:nums)
		{
			System.out.print(obj+" ");
		}

	
		
	}

}



/*
 * Imp note
 * Initial Array: {10, 3, 13, 9, 7}
The steps and results are identical to the first code. Both versions will execute the same comparisons, shifts, and inserts, and will sort the array in exactly the same way. This is because the conditions while(nums[j] > key && j >= 0) and while(j >= 0 && nums[j] > key) are logically equivalent when both parts are well-formed.

Cause of ArrayIndexOutOfBoundsException
In the first code:

If j becomes -1, the code checks nums[j] > key before verifying that j >= 0. This leads to an attempt to access nums[-1], causing an ArrayIndexOutOfBoundsException.
In the second code:

The condition j >= 0 is checked first, so the nums[j] > key condition is never evaluated when j is -1, thus avoiding the ArrayIndexOutOfBoundsException.
Conclusion
The second code correctly prevents the ArrayIndexOutOfBoundsException by checking the index bounds before accessing the array, while the first code does not.







 * */
