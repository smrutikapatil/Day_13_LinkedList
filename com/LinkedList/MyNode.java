package com.LinkedList;

public class MyNode<K> implements INode<K> {
	private K Key;
	private INode<K> next;

	public MyNode(K Key) {
		this.Key = Key;
	}

	@Override
	public K getKey() {
		return Key;
	}

	@Override
	public void setKey(K Key) {
		this.Key = Key;
	}

	@Override
	public INode<K> getNext() {
		return next;
	}

	@Override
	public void setNext(INode<K> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		StringBuilder myString = new StringBuilder();
		myString.append("{MyNode:" + "key=").append(Key).append("}");
		if (next != null) {
			myString.append("-->").append(next);
		}
		return myString.toString();
	}
}
