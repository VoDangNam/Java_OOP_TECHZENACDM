package lession08_Genertic.excercie.myQueueStudy.baseArrayList;

import java.util.ArrayDeque;
import java.util.Queue;

public class MainMyQueueARL {
    public static void main(String[] args) {
        MyQueueARL<String> myQueueARL = new MyQueueARL<>(2);
        myQueueARL.enqueue("A");
        myQueueARL.enqueue("B");
        myQueueARL.enqueue("C");

        System.out.println("MyQueueARL:");
        System.out.println(myQueueARL);           // A B C
        System.out.println("peek = " + myQueueARL.peek());   // A
        System.out.println("dequeue = " + myQueueARL.dequeue()); // A
        System.out.println(myQueueARL);           // B C
        System.out.println("size = " + myQueueARL.size());
        System.out.println();

        Queue<String> queue = new ArrayDeque<>(2);
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println("Java Queue (ArrayDeque):");
        System.out.println(queue);               // [A, B, C]
        System.out.println("peek = " + queue.peek());  // A
        System.out.println("poll = " + queue.poll());  // A
        System.out.println(queue);               // [B, C]
        System.out.println("size = " + queue.size());

    }
}
