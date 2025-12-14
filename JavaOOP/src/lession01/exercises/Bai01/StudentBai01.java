package lession01.exercises.Bai01;

import java.util.Scanner;

public class StudentBai01 {
    String name;
    double mathScore,literatureScore;

    public double calculateAverageScore(){
        return (mathScore+literatureScore)/2;
    }

    public void input(Scanner sc) {
        System.out.print("Moi ban nhap vao ten sinh vien: ");
        name = sc.nextLine();
        System.out.print("Moi ban nhap vao diem toan: ");
        mathScore = Double.parseDouble(sc.nextLine());
        System.out.print("Moi ban nhap vao diem van: ");
        literatureScore = Double.parseDouble(sc.nextLine());
    }

    public void ouput() {
        System.out.println("Thong tin student " + name);
        System.out.println("Ten Sv la: " + name);
        System.out.println("Diem Toan la: " + mathScore);
        System.out.println("Diem Van la: " + literatureScore);
        System.out.println("Diem trung binh: "+ calculateAverageScore());
    }

}
