package com.bridgelabz.bootcamp.lindkedlist;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList linkedList = new LinkedList();
		linkedList.insert(4);
		linkedList.insert(5);
		linkedList.insert(16);
		linkedList.insertAtStart(25);
		linkedList.insertAtMid(1, 55);
		/*
		 * linkedList.deleteAtEnd(); linkedList.deleteAtMid(2);
		 * linkedList.deleteAtStart();
		 */
		linkedList.show();
	}

}
