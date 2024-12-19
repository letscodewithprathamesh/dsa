package test1;

import java.util.Arrays;
import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String list[]=new String[5];
		
		for(int i=0;i<5;i++)
		{
			list[i]=sc.next();
		}
		
		System.out.println(Arrays.toString(list));
		
		for(int i=0;i<list.length;i++)
		{
			String result=list[i];
			
			for(char c:result.toCharArray())
			{
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				{
					System.out.print(c+" ");
				}
			}
			
			System.out.println();
		}
		
		sc.close();
	}
	
}
