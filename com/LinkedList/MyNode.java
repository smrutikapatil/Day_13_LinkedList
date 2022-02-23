package com.LinkedList;

public class MyNode {

public int key;
MyNode next;
public MyNode(int key){
    this.key = key;
    this.next = null;
}

@Override
public String toString() {
    return "Node{" +
            "key =" + key +
            ", next=" + next;};
}
