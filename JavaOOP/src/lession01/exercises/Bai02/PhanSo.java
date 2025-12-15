package lession01.exercises.Bai02;

import lession02_contructor_static.exercises.Bai01PhanSo;

import java.util.Scanner;

public class PhanSo {
    int mauSo;
    int tuSo;


    public boolean laPhanSoKhong() {
        return tuSo == 0;
    }

    public boolean laPhanSoDuong() {
        if (tuSo == 0) return true;
        return (tuSo > 0 && mauSo > 0) || (tuSo < 0 && mauSo < 0);
    }

    public void thuongPhanSo(PhanSo psOther) {
        this.tuSo = this.tuSo * psOther.mauSo;
        this.mauSo = this.mauSo * psOther.tuSo;
        if (psOther.tuSo == 0) {
            System.out.println("Khong the chia cho phan so co tu so = 0");
            return;
        }
        rutGon(this);
        System.out.printf("Ket qua hai phan so sau khi chia: %d/%d", this.tuSo, this.mauSo);
    }

    public void hieuPhanSo(PhanSo psOther) {
        this.tuSo = (this.tuSo * psOther.mauSo) - (this.mauSo * psOther.tuSo);
        this.mauSo = this.mauSo * psOther.mauSo;
        rutGon(this);
        System.out.printf("Ket qua hai phan so sau khi tru: %d/%d", this.tuSo, this.mauSo);
    }

    public void nhanPhanSo(PhanSo psOther) {

        this.tuSo = this.tuSo * psOther.tuSo;
        this.mauSo = this.mauSo * psOther.mauSo;
        rutGon(this);
        System.out.printf("Ket qua hai phan so sau khi nhan: %d/%d", this.tuSo, this.mauSo);
    }

    public void congPhanSo(PhanSo psOther) {
//        a/b + c/d = (ad + bc) / (bd)
        this.tuSo = this.tuSo * psOther.mauSo + this.mauSo * psOther.tuSo;
        this.mauSo = this.mauSo * psOther.mauSo;
        rutGon(this);
        System.out.printf("Ket qua hai phan so sau khi cong: %d/%d", this.tuSo, this.mauSo);
    }

    public void input(Scanner sc) {
        System.out.print("Nhap vao tu so: ");
        tuSo = Integer.parseInt(sc.nextLine());
        do {
            System.out.print("Nhap vao mau so (mau so khac 0): ");
            mauSo = Integer.parseInt(sc.nextLine());
            if (mauSo == 0) {
                System.out.println("Vui long nhap lai mau so khac 0");
            }
        } while (mauSo == 0);
    }

    public void output() {
        rutGon(this);
        if (this.mauSo < 0 || this.mauSo == 1) {
            System.out.printf("Phan so cua ban: %d", tuSo);
        } else {
            System.out.printf("Phan so cua ban: %d/%d \n", tuSo, mauSo);
        }
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public void rutGon(PhanSo ps) {
        int ucln = gcd(Math.abs(ps.tuSo), Math.abs(ps.mauSo));

        ps.tuSo /= ucln;
        ps.mauSo /= ucln;

        if (ps.mauSo < 0) {
            ps.tuSo = -ps.tuSo;
            ps.mauSo = -ps.mauSo;
        }
    }
}
