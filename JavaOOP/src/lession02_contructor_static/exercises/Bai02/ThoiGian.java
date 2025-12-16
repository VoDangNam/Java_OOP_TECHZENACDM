package lession02_contructor_static.exercises.Bai02;

public class ThoiGian {
    private int gio, phut, giay;

    public ThoiGian() {
    }

    public ThoiGian(ThoiGian tg) {
        this.gio = tg.gio;
        this.phut = tg.phut;
        this.giay = tg.giay;
    }

    public ThoiGian(int gio, int phut, int giay) {
        this.phut = phut;
        this.gio = gio;
        this.giay = giay;
    }

    public ThoiGian(int gio) {
        this.gio = gio;
    }

    public ThoiGian(int gio, int phut) {
        this.phut = phut;
        this.gio = gio;
    }


    public void xuat() {
        System.out.printf("%02d:%02d:%02d%n", gio, phut, giay);
    }
}
