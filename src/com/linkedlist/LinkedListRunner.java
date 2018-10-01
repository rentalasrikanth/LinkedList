package com.linkedlist;

public class LinkedListRunner {

	public static void main(String[] args) {
		
		/*LinkedList list = new LinkedList();
		list.insert(18);
		list.insert(34);
		list.insert(12);
		
		list.show();*/
		
		LinkedListImproved listImproved = new LinkedListImproved();
		listImproved.insert(10);
		listImproved.insert(11);
		listImproved.insert(15);
		listImproved.insert(1, 20);
		listImproved.insert(0, 1);
		listImproved.show();
		listImproved.getSize();
		//1,10,20,11,15
		listImproved.deleteAt(2);
		listImproved.getSize();
		//1,10,11,15
		listImproved.show();
		listImproved.deleteAt(0);
		listImproved.getSize();
		// 10,20,15
		listImproved.show();
		listImproved.getSize();
		listImproved.showAt(2);
	}
	
}
