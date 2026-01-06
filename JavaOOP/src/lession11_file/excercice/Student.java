package lession11_file.excercice;

import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private double score;

    public Student() {
    }

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== Create Student ====");
        System.out.print("Student id: ");
        id = sc.nextLine();
        System.out.print("Full Name: ");
        name = sc.nextLine();
        System.out.print("Score: ");
        score = Double.parseDouble(sc.nextLine());
    }

    public void output() {
        System.out.println("ID: " + this.id);
        System.out.println("Tên: " + this.name);
        System.out.println("Điểm: " + this.score);
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s", id, name, score);
    }


}
