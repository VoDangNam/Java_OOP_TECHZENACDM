package lession03_ke_thua.excercises.Bai04;

import java.util.Scanner;

public class DienThoai {
    protected String id;
    protected String ten;
    protected double giaBan;
    protected int thoiGianBaoHanh;
    protected String hangSanXuat;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten dien thoai: ");
        ten = sc.nextLine();
        System.out.print("Gia ban: ");
        giaBan = sc.nextDouble();
        System.out.print("Thoi gian bao hanh (thang): ");
        thoiGianBaoHanh = sc.nextInt();
        sc.nextLine();
        System.out.print("Hang san xuat: ");
        hangSanXuat = sc.nextLine();
    }

    public void output() {
        System.out.print(id + " " + ten + " " + giaBan +
                "  " + thoiGianBaoHanh + " thang | " + hangSanXuat);
    }

    public String getId() {
        return id;
    }
}
