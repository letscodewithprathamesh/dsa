package test4;

public class Runner {

	public static void main(String[] args) {
		
		
		Queue queue=new Queue();
		
		queue.enQueue(10);
		queue.enQueue(15);
		queue.enQueue(25);
		queue.deQueue();
		queue.show();
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
		
		
	}
	
	
}
