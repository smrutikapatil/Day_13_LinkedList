package com.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
	@Test
	public void given3numberWhenAddedToLinkedListShouldPassedToTop() {
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		LinkedList linkedlist = new LinkedList();
		linkedlist.add(myFirstNode);
		linkedlist.add(mySecondNode);
		linkedlist.add(myThirdNode);
		linkedlist.printMyNode();

		boolean result = linkedlist.head.equals(myThirdNode) && linkedlist.head.getNext().equals(mySecondNode)
				&& linkedlist.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}
}