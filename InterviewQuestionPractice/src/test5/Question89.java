package test5;

//Find a Number Apperance Once , while all other are twice in an Array

public class Question89 {

	public static void main(String[] args) {
		
		int arr[]= {1,2,2,4,4};
		System.out.println(singleelement(arr));
	}

	private static int singleelement(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i]; //select an element   1
			int cnt=0;
			
			//find the occurance of that particular element
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j] == num)          //1==1 cnt=1 , 1 compare with all other element of array it will return false and the count will be 1
				{
					cnt++;
				}
			}
			
			//if count is greater than 1 then If loop will not execute and next element will be selected
			if(cnt == 1)
			{
				return num;
			}	
		}
		
		return -1;
	}
	
	
}
