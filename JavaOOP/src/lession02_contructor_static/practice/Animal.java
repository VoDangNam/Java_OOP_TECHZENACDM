package lession02_contructor_static.practice;


import java.util.Scanner;

public class Animal {
    private int id;
    private String name;
    private String color;
    private int age;

    public Animal(int id) {
        this.id = id;
    }

    public Animal(int id, String name, String color, int age) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Animal() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

/*
    public void input(Scanner sc) {
        System.out.print("Nhap vao id: ");
        id = sc.nextInt();
        System.out.print("Nhap vao ten: ");
        name = sc.nextLine();
        sc.nextLine();
        System.out.print("Nhap vao mau sac: ");
        color = sc.nextLine();
        System.out.println("Nhap vao tuoi: ");
        age = sc.nextInt();
    }
*/

    public void output() {
        System.out.println("====XUAT====");
        System.out.println("Id: "+id);
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Age: " + age);
    }
}
