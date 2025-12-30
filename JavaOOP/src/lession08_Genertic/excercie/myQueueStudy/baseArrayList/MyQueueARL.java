package lession08_Genertic.excercie.myQueueStudy.baseArrayList;

public class MyQueueARL<E> {

    private int capacity;
    private E[] arr;
    private final E[] emptyArray = (E[]) new Object[0];
    private int size;

    public MyQueueARL() {
        arr = emptyArray;
    }


    public MyQueueARL(int capacity) {
        this.capacity = capacity;
        arr = (E[]) new Object[this.capacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(E element) {
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
            throw new RuntimeException("Queue is empty");
        }
        return arr[0];
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        E value = arr[0];

        for (int i = 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }

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
