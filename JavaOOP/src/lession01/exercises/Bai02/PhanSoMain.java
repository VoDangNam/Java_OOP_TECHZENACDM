package lession01.exercises.Bai02;

import java.util.Scanner;

public class PhanSoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();

        System.out.println("Nhap phan so thu nhat:");
        ps1.input(sc);

        System.out.println("Nhap phan so thu hai:");
        ps2.input(sc);

        System.out.print("Phan so 1: ");
        ps1.output();
        System.out.println();

        System.out.print("Phan so 2: ");
        ps2.output();
        System.out.println();

        PhanSo cong = new PhanSo();
        cong.tuSo = ps1.tuSo;
        cong.mauSo = ps1.mauSo;
        cong.congPhanSo(ps2);
        System.out.println();

        PhanSo hieu = new PhanSo();
        hieu.tuSo = ps1.tuSo;
        hieu.mauSo = ps1.mauSo;
        hieu.hieuPhanSo(ps2);
        System.out.println();

        PhanSo tich = new PhanSo();
        tich.tuSo = ps1.tuSo;
        tich.mauSo = ps1.mauSo;
        tich.nhanPhanSo(ps2);
        System.out.println();

        PhanSo thuong = new PhanSo();
        thuong.tuSo = ps1.tuSo;
        thuong.mauSo = ps1.mauSo;
        thuong.thuongPhanSo(ps2);
        System.out.println();
        System.out.println("Phan so duong? " + ps1.laPhanSoDuong());
        System.out.println("Phan so bang 0? " + ps1.laPhanSoKhong());

    }

}
