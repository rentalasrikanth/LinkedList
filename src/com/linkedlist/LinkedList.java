package com.linkedlist;

public class LinkedList {
	
	Node head;
	
	// This does an insert at the start of the list...so would be the head/first node
	public void insertAtStart(int data)
	{
		head = new Node(); // create a new node
		head.data = data; // set the values from the user
		head.next = null; // since there are no other elements...set the next to null.
	}
	
	// This does an insert at the end of the list...so would be the last node
	public void insert(int data)
	{
		Node node = new Node();
		node.data = data;
		
		// If the user is inserting the first node...check for null on the head 
		if(head == null)
		{
			head = node; // assign the node as the head...
		}
		else // If the list already has some elements in the list...then create a new node 
		{
			Node n = head;
			while(n.next!= null) // since this would be created at the end of the list...traverse to the end beginning at the head
			{
				n = n.next;
			}
			
			n.next = node;
		}
	}
	
	public void insert(int index, int data)
	{
		
	}
	
	public void delete(int index, int data)
	{
		
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
	}
	
	public void show(int index, int data)
	{
		
	}
	
	public int size()
	{
		return 0;
	}

}

class Node {

	int data;
	Node next;

	Node(){}
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
	/*public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}*/
}
