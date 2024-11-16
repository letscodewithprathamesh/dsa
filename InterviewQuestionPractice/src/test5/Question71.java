package test5;

//Find Smallest element from Array

public class Question71 
{
	public static void main(String[] args) 
	{
		
		int arr[]= {4,7,1,10,8};
		
		System.out.println("Smallest Element "+maxElement(arr));
		
	}
	
	static int maxElement(int arr[])
	{
		int size=arr.length;
		
		int min=arr[0];//we take temp variable min with zero index and compare with all other element .if number is smaller than this we swap with current element . 
		//we can also use Integer.MAX_VALUE here min variable assign min value which 214... , because we want to compare value smaller than min and assign that value to min which will be our final result
		
		for(int i=0;i<size;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		
		return min;
	}

}
