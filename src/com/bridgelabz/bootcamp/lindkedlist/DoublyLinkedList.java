package com.bridgelabz.bootcamp.lindkedlist;

public class DoublyLinkedList {

	Node head;

	// Insert at the end of list
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.previous = null;
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
			node.previous = n;
		}
	}

	// Insertion at the start of the list
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.previous = null;
		node.next = head;
		head.previous = node;
		head = node;
	}

	// Insertion at the middle of the list
	public void insertAtMid(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.previous = null;

		if (index == 0) {
			insertAtStart(data);
		} else {
			Node first = head;
			Node last = first.next;
			for (int i = 0; i < index - 1; i++) {
				first = first.next;
				last = last.next;
			}
			node.next = first.next;
			node.previous = first;
			first.next = node;
			last.previous = node;
		}
	}

	// Deletion of the node from the list

	// deletion of the node from the end.
	public void deleteAtEnd() {
		Node node = head;
		// Node prev=node;
		while (node.next != null) {
			// prev=node;
			node = node.next;
		}
		node = node.previous;
		node.next = null;
	}

	// deletion of the node from the start.
	public void deleteAtStart() {
		Node node = head;
		head = head.next;
		head.previous = null;
	}

	public void deleteAtMid(int index) {
		Node node = head;
		Node first = node;
		Node last = node.next;
		for (int i = 0; i < index; i++) {
			first = node;
			node = node.next;
			last = node.next;
		}
		first.next = node.next;
		last.previous = node.previous;
	}

	// show data
	public void show() {
		Node node = head;
		while (node.next != null) {
			System.out.println(node.previous + "  " + node.data + "  " + node.next);
			node = node.next;
		}
		System.out.println(node.previous + "  " + node.data + "   " + node.next);

	}
}
