package lession08_Genertic.excercie.MyStack.baseArrayList;

import java.util.Stack;

public class MainStackARL {
    public static void main(String[] args) {
        MyStackARL<String> myStackARLString = new MyStackARL<>();
        myStackARLString.push("Nam");
        myStackARLString.push("Nam2");
        myStackARLString.push("Nam3");
        System.out.println(myStackARLString.size());
        System.out.println("MyStack: " + myStackARLString.peek());
        while (!myStackARLString.isEmpty()) {
            System.out.println("MyStack: " + myStackARLString.pop());
        }
        System.out.println(myStackARLString.size());
        System.out.println("Stack");
        Stack<String> myStack = new Stack<>();
        myStack.push("Nam");
        myStack.push("Nam2");
        myStack.push("Nam3");
        System.out.println(myStack.size());
        System.out.println("MyStack: " + myStack.peek());
        while (!myStack.isEmpty()) {
            System.out.println("MyStack: " + myStack.pop());
        }

        System.out.println(myStack.size());
    }
}
