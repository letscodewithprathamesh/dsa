package test1;

//Decimal to  Binary

public class Question16
{
	public static void main(String[] args) {
		
		int num=10;
		
		int i=0;
		
		int binary[]=new int[100];  //empty Array (temperory array to store result )
		
		while(num != 0)
		{
			binary[i]=num%2;  //0,1,0,1
			i++;			 //0,1,2,3
			num=num/2;      //5,2,1,0
		}
		
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(binary[j]);  //print array in reverse to get the binary result 
		}
		
		
	}

}


/*
 * If the decimal number is 10. 
Step 1: Remainder when 10 is divided by 2 is zero. Therefore, arr[0] = 0. 
Step 2: Divide 10 by 2. New number is 10/2 = 5. 
Step 3: Remainder when 5 is divided by 2 is 1. Therefore, arr[1] = 1. 
Step 4: Divide 5 by 2. New number is 5/2 = 2. 
Step 5: Remainder when 2 is divided by 2 is zero. Therefore, arr[2] = 0. 
Step 6: Divide 2 by 2. New number is 2/2 = 1. 
Step 7: Remainder when 1 is divided by 2 is 1. Therefore, arr[3] = 1. 
Step 8: Divide 1 by 2. New number is 1/2 = 0. 
Step 9: Since number becomes = 0. Print the array in reverse order. Therefore the equivalent binary number is 1010.
 * */
