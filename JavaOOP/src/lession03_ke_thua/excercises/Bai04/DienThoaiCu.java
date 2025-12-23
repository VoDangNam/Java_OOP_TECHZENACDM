package lession03_ke_thua.excercises.Bai04;

import java.util.Scanner;

public class DienThoaiCu extends DienThoai {

    private int tinhTrangPin;
    private String moTa;
    private static int count = 0;

    public DienThoaiCu() {
        count++;
        id = String.format("DTC%03d", count);
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Tinh trang pin (%): ");
        tinhTrangPin = sc.nextInt();
        sc.nextLine();
        System.out.print("Mo ta: ");
        moTa = sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println(" | Pin: " + tinhTrangPin + "% | " + moTa);
    }
}
