package test2;

public class LinkedList {

	Node head; //it contains null value of return type Node Object .... head is variable which return Node Object and right now the value is null
	
	public void insert(int data) 
	{
		Node node=new Node(); //node Object
		
		node.data=data;
		
		node.next=null;
		
		if(head == null)
		{
			head=node;
		}
		else
		{
			Node n=head;
			
			while(n.next != null)
			{
				n=n.next;
			}
			n.next=node;
		}
		
		
	}
	
	
	public void show()
	{
		Node node=head;
		
		while(node.next != null)
		{
			System.out.println(node.data);
			node =node.next;
		}
		System.out.println(node.data);
		
		
	}
	
	
	

}


/*
 * Node head; 
 * head: This variable is a reference to the first node in the linked list. Initially, it is null, indicating that the list is empty.
 * 
 * public void insert(int data) 
{
    Node node = new Node(); // Create a new Node object.
    
    node.data = data; // Set the data of the new node.
    
    node.next = null; // Initially, the next reference is set to null because this will be the last node.
    
    if (head == null) // If the list is empty (head is null), this new node becomes the head.
    {
        head = node; // The new node is now the first node in the list.
    }
    else // If the list is not empty
    {
        Node n = head; // Start from the head node.
        
        while (n.next != null) // Traverse the list to find the last node.
        {
            n = n.next; // Move to the next node.
        }
        
        n.next = node; // Link the last node to the new node, making it the new last node.
    }
}

Step-by-Step Explanation of insert:
Create a New Node:

A new node object is created with the data passed to the insert method.
node.next = null; ensures that the new node does not initially point to any other node, as it will be the last node in the list.
Check if List is Empty:

If head is null, it means the list is empty, so the new node becomes the head of the list.
Traverse to the End of the List:

If the list is not empty, the code initializes a temporary variable n to point to the head.
The while loop traverses the list by following the next references until it finds the last node (where n.next is null).
Link the New Node:

Once the last node is found, the next reference of that last node is updated to point to the new node.


public void show()
{
    Node node = head; // Start from the head node.
    
    while (node.next != null) // Traverse the list until the last node.
    {
        System.out.println(node.data); // Print the data of each node.
        node = node.next; // Move to the next node.
    }
    System.out.println(node.data); // Print the data of the last node.
}

Step-by-Step Explanation of show:
Start from the Head:

A temporary variable node is initialized to point to the head.
Traverse the List:

The while loop iterates through the list by following the next references. It prints the data of each node until it reaches the last node (where node.next is null).
Print the Last Node:

After the loop, the last node's data is printed since the loop stops before printing it.
Summary:
insert(int data): This method adds a new node with the specified data to the end of the linked list. If the list is empty, the new node becomes the head.
show(): This method traverses the linked list from the head to the end, printing the data of each node.

head -> [10] -> [20] -> [30] -> null

 * */
