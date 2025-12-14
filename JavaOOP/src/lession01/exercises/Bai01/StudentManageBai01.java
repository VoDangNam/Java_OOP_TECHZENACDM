package lession01.exercises.Bai01;

import lession01.practice.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManageBai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<StudentBai01> students = new ArrayList<>();
        int n;
        do {
            System.out.print("Nhap vao so luong sinh vien: ");
            n = Integer.parseInt(sc.nextLine());
            if (n < 0) {
                System.out.println("Vui long nhap lai so luong sinh vien phai lon hon 0");
            }
        } while (n < 0);

        StudentBai01 student;
        for (int i = 0; i < n; i++) {
            student = new StudentBai01();
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
