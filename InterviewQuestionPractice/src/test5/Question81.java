package test5;

//Average of Positive Number

public class Question81 
{
	public static void main(String[] args)
	{
		int arr[]= {10,-1,0,5,-10,12,-5};
		
		int sum=0;
		
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				sum=sum+arr[i];
				count++;
			}
		}
		
		if (count > 0)
		{
            int result = sum / count; // Calculate average
            System.out.println(result); // Output the result
        } 
		else
		{
            System.out.println("No positive numbers to calculate average.");
        }
		
		
		
	}

}
