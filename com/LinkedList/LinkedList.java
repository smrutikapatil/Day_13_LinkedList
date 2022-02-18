package com.LinkedList;

public class LinkedList<K> {
	public INode head;
	public INode tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode myNode) {
		if (this.tail == null) {
			this.tail = myNode;
		}
		if (this.head == null) {
			this.head = myNode;
		} else {
			INode tempNode = this.head;
			this.head = myNode;
			this.head.setNext(tempNode);
		}
	}

	public void append(INode<K> myNode) {
		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		} else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}

	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}

	public INode popLast() {
		INode tempNode = head;
		while (tempNode.getNext().getNext() != null) {
			tempNode = tempNode.getNext();
		}
		tempNode.setNext(null);
		return tempNode;
	}

	public void search(K key) {
		INode<K> tempNode = this.head;
		int count = 0;
		while (tempNode != null) {
			count++;
			tempNode = tempNode.getNext();
			if (tempNode.getKey().equals(key)) {
				break;
			}
		}
		int option = Integer.parseInt(String.valueOf(count));
		switch (option) {
		case 0:
			System.out.println("Node is present at first node");
			break;
		case 1:
			System.out.println("Node is present at second node");
			break;
		case 2:
			System.out.println("Node is present at third node");
			break;
		default:
			System.out.println("Node is not present in the list");
		}
	}

	public void printMyNode() {
		System.out.println(head);
	}
}
