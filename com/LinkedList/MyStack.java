package com.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyStack {
	@Test
	public void sortList() {
		LinkedList linkedList = new LinkedList();
		linkedList.push(70);
		linkedList.push(40);
		linkedList.push(30);
		linkedList.push(56);
		System.out.println("before sorting the list");
		linkedList.printMyNode();
		linkedList.sort();
		System.out.println("after sorting the list");
		linkedList.printMyNode();
	}
}