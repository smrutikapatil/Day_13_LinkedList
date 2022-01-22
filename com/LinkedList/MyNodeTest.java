package com.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
	@Test
	public void given3NumberWhenInsertingSecondInBetweenShouldPassLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		LinkedList linkedlist = new LinkedList();
		linkedlist.add(myFirstNode);
		linkedlist.append(myThirdNode);
		linkedlist.insert(myFirstNode, mySecondNode);
		linkedlist.printMyNode();

		boolean result = linkedlist.head.equals(myFirstNode) && linkedlist.head.getNext().equals(mySecondNode)
				&& linkedlist.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
}