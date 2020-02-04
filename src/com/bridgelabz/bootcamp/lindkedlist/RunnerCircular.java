package com.bridgelabz.bootcamp.lindkedlist;

public class RunnerCircular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList circularLinkedList = new CircularLinkedList();
		circularLinkedList.insertAtEnd(24);
		circularLinkedList.insertAtEnd(34);
		circularLinkedList.insertAtEnd(44);

		circularLinkedList.insertAtStart(50);
		circularLinkedList.insertAtStart(60);

		circularLinkedList.insertAtMid(2, 30);

		circularLinkedList.deletionAtEnd();

		circularLinkedList.deletionAtStart();

		circularLinkedList.deletionAtMid(1);
		circularLinkedList.show();
	}

}
