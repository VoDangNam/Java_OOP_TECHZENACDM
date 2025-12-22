package lession03_ke_thua.excercises.Bai01;

public class Student {
    private String maSoSinhVien;
    private String ten;
    private double diem;

    static int studentCount = 0;

    public Student(String maSoSinhVien, String ten, double diem) {
        this.maSoSinhVien = maSoSinhVien;
        this.ten = ten;
        this.diem = diem;
        studentCount++;
    }

    public String getMaSoSinhVien() {
        return maSoSinhVien;
    }

    public void setMaSoSinhVien(String maSoSinhVien) {
        this.maSoSinhVien = maSoSinhVien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public static int getStudentCount() {
        return studentCount;
    }
}
