package lession08_Genertic.excercie.myQueueStudy.baseLinked;

public class MyQueue<E> {
    public class Node {
        private final E value;
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

    public E peek() {
        return this.tail.value;
    }

    public void add(E value) {
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

    public E poll() {
        Node temp1 = head;
        Node temp2;

        if (head == null) {
            return null;
        } else if (this.size == 1) {
            Node temp3 = head;
            head = null;
            tail = null;
            size--;
            return temp3.value;
        } else {
            while (temp1.next != tail) {
                temp1 = temp1.next;
            }

            temp2 = tail;
            tail = temp1;
            size--;
        }
        return temp2.value;
    }

    public boolean isEmpty() {

        if (size != 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node temp = head;
        for (int i = 0; i < size; i++) {
            stringBuilder.append(temp.value).append("\t");
            temp = temp.next;
        }
        return stringBuilder.toString();
    }

}
