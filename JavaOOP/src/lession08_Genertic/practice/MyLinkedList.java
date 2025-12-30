package lession08_Genertic.practice;

public class MyLinkedList<E> {
    private class Node {
        private E value;
        private Node next;

        private Node(E value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int size() {
        return size;
    }

    public void addFirst(E value) {
        Node x = new Node(value);
        if (head == null) {
            head = x;
            tail = x;
        } else {
            x.next = head;
            head = x;
        }
        size++;
    }

    public void addLast(E value) {
        Node x = new Node(value);
        if (head == null) {
            head = x;
            tail = x;
        } else {
            tail.next = x;
            tail = x;
        }
        size++;
    }

    public void addIndex(int index, E value) {
        Node x = new Node(value);
        if (head == null) {
            addFirst(value);
        } else if (index < 0 || index > size) {
            System.out.println("Index vuot qua kich co!!!");
        } else if (index == 0) {
            addFirst(value);
        } else if (index == size) {
            addLast(value);
        } else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            x.next = temp.next;
            temp.next = x;
            size++;
        }
    }

    public E removeFirst() {
        Node tempsss;
        if (head == null) {
            return null;
        } else if (this.size == 1) {
            Node tempss;
            tempss = head;
            head = null;
            tail = null;
            return tempss.value;
        } else {
            tempsss = head;
            head = head.next;
        }
        size--;
        return tempsss.value;
    }

    public E removeLast() {
        Node tempsss = head;
        Node temps;
        if (head == null) {
            return null;
        } else if (this.size == 1) {
            Node tempss;
            tempss = head;
            head = null;
            tail = null;
            return tempss.value;
        } else {
            while (tempsss.next != tail) {
                tempsss = tempsss.next;
            }
            temps = tail;
            tail = tempsss;
            size--;
        }
        return temps.value;
    }

    public E getFirst() {
        return getHead().value;
    }

    public E getLast() {
        return getTail().value;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index vuot qua kich co!!!");
            return null;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    public Integer indexOf(E element) {
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.value == element) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public Integer lastIndexOf(E element) {
        Node temp = head;
        int index = 0;
        int lastIndex = -1;

        while (temp != null) {
            if (temp.value == element) {
                lastIndex = index;
            }
            temp = temp.next;
            index++;
        }
        return lastIndex;
    }


    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            System.out.println("Index vuot qua kich co!!!");
            return null;
        }

        Node temp = head;
        E oldValue;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        oldValue = temp.value;
        temp.value = element;
        return oldValue;
    }


    public E remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index vuot qua kich co!!!");
            return null;
        }

        if (head == null) {
            return null;
        }

        Node removed;

        if (index == 0) {
            removed = head;
            head = head.next;
            if (size == 1) {
                tail = null;
            }
        } else if (index == size - 1) {
            Node temp = head;
            for (int i = 0; i < size - 2; i++) {
                temp = temp.next;
            }
            removed = tail;
            tail = temp;
            tail.next = null;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            removed = temp.next;
            temp.next = removed.next;
        }

        size--;
        return removed.value;
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
