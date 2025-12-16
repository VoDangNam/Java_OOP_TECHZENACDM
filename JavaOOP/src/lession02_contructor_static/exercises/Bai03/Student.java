package lession02_contructor_static.exercises.Bai03;

public class Student {
    static int count = 0;
    private int id = count++;
    private String name;
    private double score;

    public Student() {
    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public void ouputStd() {
        System.out.println("id: " + this.id);
        if (this.name == null || this.name.trim().isEmpty()) {
            System.out.println("Ten cua ban bi rong!!!");
        } else {
            System.out.println("Name: " + this.name);
        }
        if (this.score < 0 || this.score > 10) {
            System.out.println("Diem cua ban khong nam trong khoan 0-10!!!");
        } else {
            System.out.println("Score: " + this.score);
        }
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Ten khong duoc rong!!!");
            return;
        }
        this.name = name;
    }

    public void setScore(double score) {
        if (score < 0 || score > 10) {
            System.out.println("Diem phai nam trong khoan 0-10!!!");
            return;
        }
        this.score = score;
    }
}
