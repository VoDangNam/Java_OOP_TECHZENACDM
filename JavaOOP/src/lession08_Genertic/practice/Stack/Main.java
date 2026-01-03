package lession08_Genertic.practice.Stack;

import java.util.Scanner;
import java.util.Stack;

//FIRST LAST OUT
public class Main {
    public static void main(String[] args) {
        Stack<String> strings = new Stack<>();

        strings.push("Nam");
        strings.push("Nam2");
        strings.push("Nam3");

        int a=5;
        int b=5;

        while (!strings.isEmpty()) {
            System.out.println(strings.pop());
        }

        Scanner sc = new Scanner(System.in);

        Stack<Integer> integers = new Stack<>();
        System.out.print("Nhap vao so can chuyen sang he nhi phan: ");
        int n = Integer.parseInt(sc.nextLine());
        while (n != 0) {
            integers.push(n % 2);
            n /= 2;
        }

        while (!integers.isEmpty()){
            System.out.print(integers.pop() +" ");
        }

    }
}
