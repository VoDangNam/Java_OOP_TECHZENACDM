package lession08_Genertic.excercie.MyStack.baseArrayList;

public class MyStackARL<E> {
    private int capacity;
    private E[] arr;
    private final E[] emptyArray = (E[]) new Object[0];
    private int size;

    public MyStackARL() {
        arr = emptyArray;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(E element) {
        if (arr == emptyArray) {
            capacity = 10;
            arr = (E[]) new Object[capacity];
        }

        if (size == capacity) {
            capacity *= 1.5;
            if (size == capacity) {
                capacity++;
            }

            E[] brr = (E[]) new Object[capacity];
            for (int i = 0; i < size; i++) {
                brr[i] = arr[i];
            }
            arr = brr;
        }

        arr[size] = element;
        size++;
    }

    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[size - 1];
    }

    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        E value = arr[size - 1];
        size--;
        return value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(arr[i]).append("\t");
        }
        return sb.toString();
    }

}
