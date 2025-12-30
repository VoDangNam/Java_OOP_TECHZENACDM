package lession08_Genertic.excercie.myQueueStudy.baseLinked;

public class MainQueue {
    public static void main(String[] args) {
        MyQueue<Integer> myQueueInt = new MyQueue<>();

        myQueueInt.add(1);
        myQueueInt.add(2);
        myQueueInt.add(3);

        System.out.println(myQueueInt);

        System.out.println( myQueueInt.peek());
/*
        System.out.println("size is: "+ myQueueInt.size());
        System.out.print(myQueueInt.poll() + " ");
        while (!myQueueInt.isEmpty()) {
            System.out.print(myQueueInt.poll() + " ");
        }

        System.out.println("\nsize is: " + myQueueInt.size());*/
    }
}
