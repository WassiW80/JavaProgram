package com.bridgelabz.bootcamp.lindkedlist;

public class CircularLinkedList {

	Node head;

	// insertion at the end of the list
	public void insertAtEnd(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
			node.next = head;
		} else {
			Node n = head;
			while (n.next != head) {
				n = n.next;
			}
			n.next = node;
			node.next = head;
		}
	}

	// insertion of node at the start of the list
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		Node n = head;
		while (n.next != head) {
			n = n.next;
		}
		node.next = head;
		head = node;
		n.next = head;

	}

	// insertion of node at the mid of the list
	public void insertAtMid(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (index==0) {
			insertAtStart(data);
		}else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	// Deleetion of the node from the list

	// deletion at the end of list
	public void deletionAtEnd() {
		Node n = head;
		Node prev = n;
		while (n.next != head) {
			prev = n;
			n = n.next;
		}
		prev.next = head;
		n = null;
	}

	// deletion at start of list
	public void deletionAtStart() {
		Node n = head;
		while (n.next != head) {
			n = n.next;
		}
		head = head.next;
		n.next = head;
	}

	// deletion at mid of list
	public void deletionAtMid(int index) {
		Node n = head;
		Node prev = n;
		for (int i = 0; i < index; i++) {
			prev = n;
			n = n.next;
		}
		prev.next = n.next;
		n = null;
	}

	public void show() {
		Node node = head;
		while (node.next != head) {
			System.out.println(node.data + "   " + node.next);
			node = node.next;
		}
		System.out.println(node.data + "   " + node.next);
	}
}
