package test3;

public class Runner {
	
	public static void main(String[] args) {
		
		Stack stack=new Stack();
		
		stack.push(10);
		stack.push(15);
		System.out.println(stack.peak());
		stack.push(68);
		System.out.println(stack.pop());
		
		stack.show();
		System.out.println();
		System.out.println("Is Stack Empty"+stack.isEmpty());
		System.out.println("Stack size "+stack.size());
		
		
	}

}
