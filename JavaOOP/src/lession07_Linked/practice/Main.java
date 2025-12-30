package lession07_Linked.practice;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(10);
        myLinkedList.addFirst(20);
        myLinkedList.addFirst(30);

        myLinkedList.addLast(40);
        myLinkedList.addLast(50);
        myLinkedList.addLast(60);

        System.out.println("add index");
        myLinkedList.addIndex(5, 100);
        myLinkedList.addIndex(6, 100);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.removeFirst());
        System.out.println(myLinkedList.removeLast());
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.remove(5));
        System.out.println(myLinkedList);
        System.out.println("Get first: " + myLinkedList.getFirst());
        System.out.println("Get Last: " + myLinkedList.getLast());
        System.out.println("Get Index: " + myLinkedList.get(2));
        System.out.println("Set 3 at 3: " + myLinkedList.set(3, 3));
        System.out.println(myLinkedList);
        System.out.println(" element xuat hien dau tien o vi tri: " + myLinkedList.indexOf(3));
        System.out.println("element xuat hien cuoi cung o vi tri: " + myLinkedList.lastIndexOf(20));

    }
}
