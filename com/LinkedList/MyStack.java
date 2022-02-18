package com.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyStack {
	@Test
	public void givenSearchElementWhenLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		LinkedList linkedlist = new LinkedList();
		linkedlist.append(myFirstNode);
		linkedlist.append(mySecondNode);
		linkedlist.append(myThirdNode);
		linkedlist.search(70);
		linkedlist.printMyNode();

		boolean result = linkedlist.head.equals(myFirstNode) && linkedlist.head.getNext().equals(mySecondNode)
				&& linkedlist.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
}