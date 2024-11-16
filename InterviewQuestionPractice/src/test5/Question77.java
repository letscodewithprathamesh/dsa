package test5;

//Remove Even Integer from array and return remaining array .

public class Question77
{
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,6};
		
		int output[] = getOddArray(arr);
		
		 for(int arr2 : output)
		{
			System.out.print(arr2+" ");
		}
		
	}

	 static int[] getOddArray(int[] arr)
	 {
			int count=0;
			
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]%2 != 0)
				{
					count++;
				}
			}
			
		int result[]=new int[count];
		
		int index=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 != 0)
			{
				result[index]=arr[i];
				index++;
			}
		}
		
		return result;
	 }
	 
	
	

}

