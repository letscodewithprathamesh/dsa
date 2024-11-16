package test5;

//Second Smallest element from Array

public class Question73
{
	public static void main(String[] args)
	{
		int arr[]= {12,34,6,8,3,10};
		
		System.out.println(secondSmallest(arr));
	}

	 static int secondSmallest(int[] arr)
	 {
		 int smallest=arr[0];
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 if(smallest>arr[i])
			 {
				 smallest=arr[i];
			 }
		 }
		 
		 int second=Integer.MAX_VALUE;
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i] != smallest && second>arr[i])
			 {
				 second=arr[i];
			 }
		 }
		 
		return second;
	}

}


/*
 * Using 2 for loop , 1 loop for smallest Number , second=arr[i]  and second loop for Number which is not equal to smallest and smaller than that in array , second=Integer.MAX_VALUE. 
 * 
 * 2 nd Way
 * 
 * int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

        for (int i=0; i < n; i++){
            if(arr[i] < first){ second = first; first = arr[i]; } else if(second>arr[i])
           second = arr[i];
        }

        return second;
 * */
 