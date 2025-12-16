package lession02_contructor_static.exercises.Bai01;

public class Bai01PhanSo {
    private int tuSo = 0;
    private int mauSo = 1;

    public Bai01PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public Bai01PhanSo(int tuSo) {
        this.tuSo = tuSo;
        this.mauSo = 1;
    }

    public Bai01PhanSo() {

    }

    public Bai01PhanSo copy (){
        return new Bai01PhanSo(this.tuSo,this.mauSo);
    }

    public void cong(int x){
        this.tuSo=tuSo + x;
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public void rutGon() {
        int ucln = gcd(Math.abs(tuSo), Math.abs(mauSo));

        tuSo /= ucln;
        mauSo /= ucln;

        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }


    public void output() {
        rutGon();
        if (this.mauSo < 0 || this.mauSo == 1) {
            System.out.printf("Phan so cua ban: %d", tuSo);
        } else {
            System.out.printf("Phan so cua ban: %d/%d \n", tuSo, mauSo);
        }
    }
}
