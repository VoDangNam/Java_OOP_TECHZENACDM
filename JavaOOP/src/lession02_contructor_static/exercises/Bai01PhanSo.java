package lession02_contructor_static.exercises;

import lession01.exercises.Bai02.PhanSo;

public class Bai01PhanSo {
    private int tuSo;
    private int mauSo;

    public Bai01PhanSo() {
    }

    public Bai01PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public void congPhanSo(Bai01PhanSo psOther) {
        this.tuSo = this.tuSo * psOther.mauSo + this.mauSo * psOther.tuSo;
        this.mauSo = this.mauSo * psOther.mauSo;
        rutGon(this);
        System.out.printf("Ket qua hai phan so sau khi cong: %d/%d", this.tuSo, this.mauSo);
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public void rutGon(Bai01PhanSo ps) {
        int ucln = gcd(Math.abs(ps.tuSo), Math.abs(ps.mauSo));

        ps.tuSo /= ucln;
        ps.mauSo /= ucln;

        if (ps.mauSo < 0) {
            ps.tuSo = -ps.tuSo;
            ps.mauSo = -ps.mauSo;
        }
    }


    public void output() {
        rutGon(this);
        if (this.mauSo < 0 || this.mauSo == 1) {
            System.out.printf("Phan so cua ban: %d", tuSo);
        } else {
            System.out.printf("Phan so cua ban: %d/%d \n", tuSo, mauSo);
        }
    }
}
