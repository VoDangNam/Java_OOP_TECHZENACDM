package lession01.exercises.Bai03;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Point {
    int x;
    int y;

    public void input(Scanner sc) {
        System.out.print("Nhap vao toa do x: ");
        x = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap vao tao do y: ");
        y = Integer.parseInt((sc.nextLine()));
    }

    public double distanceTo(Point pointOther){
//        `distance = √((x2 - x1)^2 + (y2 - y1)^2)`
        return sqrt(((pointOther.x - x)*(pointOther.x - x)) + ((pointOther.y - y)*(pointOther.y - y)));
    }
}
