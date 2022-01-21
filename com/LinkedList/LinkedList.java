package com.LinkedList;

public class LinkedList<K> {
	public INode head;
	public INode tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	public void printMyNode() {
		System.out.println(head);
	}
}
