package test3;

public class Stack 
{
	int stack[]=new int[5];
	int top=0;
	
	public void push(int data)
	{
		stack[top]=data;
		top++;
	}
	
	public int pop()
	{
		//System.out.println(top);
		int data;
		top--;
		//System.out.println(top);
		data=stack[top];
		stack[top]=0;
		
		return data;
		
	}
	
	public int peak()
	{
		int data;
		data=stack[top-1];
		return data;
	}
	
	public int size()
	{
		return top;
	}
	
	public boolean isEmpty()
	{
		return top<=0;
	}
	
	
	
	public void show()
	{
		for(int x:stack)
		{
			System.out.print(x+" ");
		}
	}

}
