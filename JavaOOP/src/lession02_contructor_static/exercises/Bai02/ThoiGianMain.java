package lession02_contructor_static.exercises.Bai02;

public class ThoiGianMain {
    public static void main(String[] args) {
        ThoiGian a = new ThoiGian();
        a.xuat();

        ThoiGian b = new ThoiGian(7);
        b.xuat();

        ThoiGian c = new ThoiGian(7, 30);
        c.xuat();

        ThoiGian d = new ThoiGian(7, 30, 50);
        d.xuat();

        ThoiGian f = new ThoiGian(d);
        f.xuat();
    }
}
