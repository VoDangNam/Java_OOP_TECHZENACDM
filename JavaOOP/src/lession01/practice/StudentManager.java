package lession01.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     /*   Student s1 = new Student();
        Student s2 = new Student();*/

/*        System.out.println("Nhap thong tin SV1");
        s1.input(sc);
        System.out.println("Nhap thong tin SV2");
        s2.input(sc);

        System.out.println("Xuat tt sv 1");
        s1.ouput();
        System.out.println("Xuat tt sv 2");
        s2.ouput();
        */

        ArrayList<Student> students = new ArrayList<>();
        int n;
        do {
            System.out.print("Nhap vao so luong sinh vien: ");
            n = Integer.parseInt(sc.nextLine());
            if (n < 0) {
                System.out.println("Vui long nhap lai so luong sinh vien phai lon hon 0");
            }
        } while (n < 0);

        Student student;
        for (int i = 0; i < n; i++) {
            student = new Student();
            System.out.println("Nhap vao thong tin student thu " + (i + 1));
            student.input(sc);
            students.add(student);
        }

        for(int i =0;i<n;i++){
            System.out.printf("Thong tin sv %d ", (i + 1));
            students.get(i).ouput();
        }

    }
}
