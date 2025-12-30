package lession6_MyArrayList.practice;

public class MyArrayList {
    private int capacity;
    private int[] arr;
    private final int[] emptyArray = {};

    private int size;

    public int capacity() {
        return capacity;
    }

    public int size() {
        return size;
    }

    public MyArrayList() {
        arr = emptyArray;
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        arr = new int[this.capacity];
    }

    public void add(int emlement) {
        if (arr == emptyArray) {
            this.capacity = 10;
            arr = new int[this.capacity];
        }
        if (size == this.capacity) {
            this.capacity *= 1.5;
            if (size == this.capacity) {
                capacity++;
            }
            int[] brr = new int[this.capacity];
            for (int i = 0; i < size; i++) {
                brr[i] = arr[i];
            }
            arr = brr;
        }
        arr[size] = emlement;
        size++;
    }
    public void removeElement(int element) {
        int newSize = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] != element) {
                arr[newSize] = arr[i];
                newSize++;
            }
        }

        size = newSize;
    }


    public void remove(int index) {
        if (index < 1 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        int idx = index - 1;
        int[] brr = new int[size - 1];

        for (int i = 0; i < brr.length; i++) {
            if (i < idx) {
                brr[i] = arr[i];
            } else {
                brr[i] = arr[i + 1];
            }
        }

        arr = brr;
        size--;
    }


    public void set(int index, int element) {
        if (index < 1 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        arr[index - 1] = element;
    }




    public int get(int index) {
        if (index < 1 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        return arr[index - 1];
    }



    public void add(int index, int element) {
        if (index < 1 || index > size + 1) {
            throw new IndexOutOfBoundsException();
        }

        int idx = index - 1;
        int[] brr = new int[size + 1];

        for (int i = 0; i < size; i++) {
            if (i < idx) {
                brr[i] = arr[i];
            } else {
                brr[i + 1] = arr[i];
            }
        }

        brr[idx] = element;
        arr = brr;
        size++;
    }


    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return i + 1;
            }
        }
        return -1;
    }

    public int lastIndexOf(int element) {
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] == element) {
                return i + 1;
            }
        }
        return -1;
    }


    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(arr[i]).append("\t");
        }
        return stringBuilder.toString();
    }

}
