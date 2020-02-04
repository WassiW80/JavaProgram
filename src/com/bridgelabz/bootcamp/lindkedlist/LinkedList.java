package com.bridgelabz.bootcamp.lindkedlist;

public class LinkedList {

	Node head;

	public void insert(double data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}

	}

	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	public void insertAtMid(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (index == 0) {
			insertAtStart(data);
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	public void deleteAtEnd() {
		Node node = head;
		Node previous = node;
		while (node.next != null) {
			previous = node;
			node = node.next;
		}
		previous.next = null;
	}

	public void deleteAtMid(int index) {
		Node node = head;
		Node node2 = node;
		if (index == 0) {
			deleteAtStart();
		} else {

			for (int i = 0; i < index; i++) {
				node2 = node;
				node = node.next;
			}
			node2.next = node.next;
			node=null;
		}
	}

	public void deleteAtStart() {
		Node node = head;
		if (head.next == null) {
			head = null;
		} else {
			head = head.next;
		}

	}

	public void show() {
		Node node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
}
