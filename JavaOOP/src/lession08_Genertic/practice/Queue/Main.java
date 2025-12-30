package lession08_Genertic.practice.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

//FIRST in firts OUT
public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("size: " + queue.size());

        System.out.println(queue.peek());

        Stack<Integer> stackInt = new Stack<>();
        stackInt.push(10);
        stackInt.push(20);
        stackInt.push(30);
        stackInt.push(40);

        System.out.println(stackInt.peek());


    }
}
