package lession01.exercises.Bai03;

import java.util.Scanner;

public class PointMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Point point1 = new Point();
        Point point2 = new Point();

        System.out.println("Nhap vao toa do diem 1");
        point1.input(sc);
        System.out.println("Nhap vao tao do diem 2");
        point2.input(sc);

        System.out.println("Khoang cach cua hai diem do la: " + String.format("%.2f", point1.distanceTo(point2)));
    }
}
