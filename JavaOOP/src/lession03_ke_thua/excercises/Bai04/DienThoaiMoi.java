package lession03_ke_thua.excercises.Bai04;

import java.util.Scanner;

public class DienThoaiMoi extends DienThoai {

    private int soLuong;
    private static int count = 0;

    public DienThoaiMoi() {
        count++;
        id = String.format("DTM%03d", count);
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("So luong: ");
        soLuong = sc.nextInt();
    }

    @Override
    public void output() {
        super.output();
        System.out.println(" | So luong: " + soLuong);
    }
}
