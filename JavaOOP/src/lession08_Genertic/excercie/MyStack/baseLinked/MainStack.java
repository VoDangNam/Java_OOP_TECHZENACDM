package lession08_Genertic.excercie.MyStack.baseLinked;

public class MainStack {
    public static void main(String[] args) {
        MyStack<Integer> myStackInt = new MyStack<>();

        myStackInt.push(1);
        myStackInt.push(10);
        myStackInt.push(20);

    /*    System.out.println(myStackInt.toString());
        System.out.println("Size: "+myStackInt.size());

        while (!myStackInt.isEmpty()){
            System.out.println(myStackInt.pop());
        }

        System.out.println("Size: "+myStackInt.size());
        */

        System.out.println(myStackInt.peek());

    }
}
