package test5;

//Zero to end of an Array without Disturbing relative postion of element

public class Question78 
{
	public static void main(String[] args) 
	{
		int arr[]= {2,0,5,3,0,1};
		
		int j=0;
		
		//here we use two pointer , when i is pointing to non-zero element and j is pointing to zero element we will Swap it or Vice versa , else we will increase the j pointer .
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != 0 && arr[j]==0)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
			if(arr[j] != 0)
			{
				j++;
			}
		}
		
		for(int result:arr)
		{
			System.out.print(result+" ");
		}
		
		
	}

	

}

/*
 * Take a variable for indexing which will work as a pointer for comparison in an array
 * Use for loop to iterate over all element of array
 * use two pointer , one from for loop and one we have declared earlier then used it for comparision . 
 * here we use two pointer , when i is pointing to non-zero element and j is pointing to zero element we will Swap it or Vice versa , else we will increase the j pointer .
 * 
		
 * */
