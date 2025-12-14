package lession01.practice;

import java.util.Scanner;

public class Student {
    String name;
    int age;
    String hoppy;

    public void run() {
        System.out.println(name + " có thể chạy nhanh");
    }

    public void input(Scanner sc) {
        System.out.print("Moi ban nhap vao ten sinh vien: ");
        name = sc.nextLine();
        System.out.print("Moi ban nhap vao tuoi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("Moi ban nhap vao so thich: ");
        hoppy = sc.nextLine();
    }

    public void ouput() {
        System.out.println("Thong tin student " + name);
        System.out.println("Ten Sv la: " + name);
        System.out.println("Tuoi la: " + age);
        System.out.println("So thich la: " + hoppy);
    }
}
