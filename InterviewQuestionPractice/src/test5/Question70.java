package test5;

//Find largest Element from Array

public class Question70
{
	public static void main(String[] args) 
	{
		
		int arr[]= {4,7,1,10,8};
		
		System.out.println("Largest Element "+maxElement(arr));
		
	}
	
	static int maxElement(int arr[])
	{
		
		int max=arr[0]; //we take temp variable max with zero index and compare with all other element. if number is bigger than this we swap with current element . 
		//we can also use Integer.MIN_VALUE here max variable assign min value which -214... , because we want to compare value greater than max and assign that value to max which will be our final result
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		
		return max;
	}

}

/*
 * for max element we use minimum value , current element must be greater than max
 * for min element we use maximum value , current element must be smaller than min
 * */
 