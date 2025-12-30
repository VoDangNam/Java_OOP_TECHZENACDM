package lession08_Genertic.excercie.MyStack.baseLinked;

import java.util.Stack;

public class MyStack<E> {

    public class Node {
        private E value;
        private Node next;

        public Node(E value) {
            this.value = value;
        }
    }

    private int size;
    private Node head;
    private Node tail;

    public int size() {
        return size;
    }

    public void push(E value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public E pop() {
        Node temp1 = head;
        Node temp2;
        if (head == null) {
            return null;
        } else if (this.size == 1) {
            head = null;
            tail = null;
            size--;
            return temp1.value;
        } else {
            temp2 = head;
            head = head.next;
        }
        size--;
        return temp2.value;
    }

    public E peek() {
        return this.head.value;
    }

    public boolean isEmpty() {

        if (size != 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        Node temp = head;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(temp.value).append(" ");
            temp = temp.next;
        }
        return stringBuilder.toString();
    }


}

