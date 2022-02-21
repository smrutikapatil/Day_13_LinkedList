package com.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyStack {
	@Test
	public void givenDeleteElementWhenLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> newNode = new MyNode<>(40);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		LinkedList linkedlist = new LinkedList();
		linkedlist.add(myFirstNode);
		linkedlist.append(mySecondNode);
		linkedlist.append(myThirdNode);
		
		linkedlist.DeleteNode(40);
		linkedlist.printMyNode();
		
	}
}