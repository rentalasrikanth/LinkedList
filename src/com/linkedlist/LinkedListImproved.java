package com.linkedlist;

public class LinkedListImproved {

	Node head;
	Node tail;
	int size = 0;

	// This does an insert at the end of the list...so would be the last node
	public void insertAtStart(int data)
	{
		Node node = new Node(data);
		node.next = head;
		head = node;
	}

	// This does an insert at the end of the list...so would be the last node
	public void insert(int data)
	{
		Node node = new Node(data);
		node.data = data;

		// If the user is inserting the first node...check for null on the head // This does an insert at the start of the list...so would be the head/first node
		if(head == null)
		{
			head = tail = node; // assign the node as the head...
		}
		else // If the list already has some elements in the list...then create a new node 
		{
			tail.next = node; // Connect the next (pointer) to the next node
			tail = node; // Make the tail as the next node itself.
		}
		size++;
	}

	// This is to insert at the "index" location
	public void insert(int index, int data)
	{
		int count = 0;
		Node nextNode = head;
		// Traverse from head until the the node at the "index"
		// TODO:::Need to check if the size is good enough to insert at the index.

		if(index == 0)
			insertAtStart(data);
		else
		{
			while(count < index-1)
			{
				nextNode = nextNode.next;
				count++;
			}

			Node newNode = new Node(data); // create a new node
			newNode.next = nextNode.next; // Assign the same value of the nextnode to the newnode created
			nextNode.next = newNode; // now assign the nextnode.next to the new node (basically inserting the new node)
		}
		size++;
	}

	public void deleteAt(int index)
	{
		Node nextNode = head;
		int count = 0;
		if(index == 0)
		{
			System.out.println("deleted "+head.data + " at index: "+ index);
			head = head.next;
		}

		else
		{
			// Traverse until the the node at the "index"
			while(count < index-1)
			{
				nextNode = nextNode.next;
				count++;
			}

			Node tmp = nextNode.next;
			System.out.println("deleted: "+tmp.data + " at index: "+ index);
			nextNode.next = tmp.next;
			tmp = null; // This is to make sure that the node is available for GC.
		}
		size--;
	}

	public void show()
	{
		Node node = head;
		while(node.next!= null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
		System.out.println("----------------");
	}

	public void showAt(int index)
	{
		Node node = head;
		int count = 0;
		// Traverse until the the node at the "index"
		while(count < index)
		{
			node = node.next;
			count++;
		}
		System.out.println("Data at index: " + index +" is: "+node.data);
		System.out.println("----------------");
	}

	public int getSize()
	{
		System.out.println("Size of linked list is: " +size);
		System.out.println("----------------");
		return size;
	}

}
