package com.bridgelabz.bootcamp.lindkedlist;

public class RunnerDoubly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.insert(45);
		doublyLinkedList.insert(60);
		doublyLinkedList.insert(70);
		doublyLinkedList.insert(80);

		doublyLinkedList.insertAtStart(10);
		doublyLinkedList.insertAtStart(20);

		doublyLinkedList.insertAtMid(2, 25);

		doublyLinkedList.deleteAtEnd();

		doublyLinkedList.deleteAtStart();

		doublyLinkedList.deleteAtMid(2);
		doublyLinkedList.show();
	}

}
