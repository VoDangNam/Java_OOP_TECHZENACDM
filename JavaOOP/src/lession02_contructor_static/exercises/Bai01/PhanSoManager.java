package lession02_contructor_static.exercises.Bai01;

public class PhanSoManager {
    public static void main(String[] args) {
        Bai01PhanSo psb1 = new Bai01PhanSo();
        psb1.output();
        System.out.println();
        Bai01PhanSo psb2 = new Bai01PhanSo(1,2);
        psb2.output();
        Bai01PhanSo psb3 = new Bai01PhanSo(3);
        psb3.output();
        System.out.println();
        Bai01PhanSo psb4 = new Bai01PhanSo(-6,-2);
        psb4.output();
        System.out.println();
        Bai01PhanSo psb5 = new Bai01PhanSo(3,-1);
        psb5.output();
        System.out.println();
        Bai01PhanSo psb6 = psb5.copy();
        psb6.cong(100);
        psb5.output();
        System.out.println();
        psb6.output();
    }

}
