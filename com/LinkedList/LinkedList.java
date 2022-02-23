package com.LinkedList;

public class LinkedList {
    MyNode head;
    MyNode tail;

    public MyNode push(int key) {
        MyNode newNode = new MyNode(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            MyNode temp = head;
            this.head = newNode;
            newNode.next = temp;
        }
        return newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            MyNode temp = head;
            while (temp != null) {
                System.out.print(temp.key + " ");
                temp = temp.next;
            }
        }
    }

    public void append(int key) {
        MyNode newNode = new MyNode(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            this.tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertInBetween(MyNode previousNode, MyNode newNode) {
        MyNode tempNode = previousNode.next;
        previousNode.next = newNode;
        newNode.next = tempNode;
    }

    public void pop() {
        this.head = this.head.next;
    }

    public void popLast() {
        MyNode tempNode = head;
        while (!tempNode.next.equals(tail)) {
            tempNode = tempNode.next;
        }
        this.tail = tempNode;
        tempNode.next = null;
    }

    public void searchNode(int value) {
        MyNode tempNode = head;
        int index = 1;
        boolean flag = false;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (tempNode != null) {
                if (tempNode.key == value) {
                    flag = true;
                    break;
                }
                index++;
                tempNode = tempNode.next;
            }
        }
        if (flag == true) {
            System.out.println("Value:" + value + " is present at Index:" + index);
        } else {
            System.out.println("Element no present");
        }
    }

    public MyNode searchNodeAt(int value, MyNode newNode) {
        MyNode tempNode = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (tempNode != null) {
                if (tempNode.key == value) {
                    break;
                }
                tempNode = tempNode.next;

            }
            MyNode tempNodeNext = tempNode.next;
            tempNode.next = newNode;
            newNode.next = tempNodeNext;
        }
        return tempNode;
    }

    public void deleteANode(int value) {
        if (this.head == null) {
            System.out.println("List is Empty");
            return;
        }
        MyNode tempNode = head;
        while (tempNode.next.key != value) {
            tempNode = tempNode.next;
        }
        MyNode previousNode = tempNode;
        MyNode nextNode = tempNode.next.next;
        previousNode.next = nextNode;
    }

    public void sort() {
        MyNode initialStart = head, index = null;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (initialStart != null) {
            index = initialStart.next;
            while (index != null) {
                if (initialStart.key > index.key) {
                    int temp = initialStart.key;
                    initialStart.key = index.key;
                    index.key = temp;
                }
                index = index.next;
            }
            initialStart = initialStart.next;
        }
    }
public void printMyNode() {
		System.out.println(head);
	}
}