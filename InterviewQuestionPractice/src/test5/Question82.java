package test5;

//Seperate Even and Odd Number

public class Question82 
{
	public static void main(String[] args)
	{
		int arr[]= {3,10,7,2,8,6};
		
		int j=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 == 0)
			{
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
			
		}
		
		for(int out:arr)
		{
			System.out.print(out);
		}
		
	}

}