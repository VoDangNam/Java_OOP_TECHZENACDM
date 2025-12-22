package lession03_ke_thua.practice.EmployeesLession;

import java.util.Scanner;

public class Employee {
    private String id;
    private String name;
    private String date;
    private String address;

    public void updateEmployee(Scanner sc) {
        String newName;
        String newDate;
        String newAddess;
        System.out.print("Nhap vao ten moi: ");
        newName = sc.nextLine();
        System.out.print("Nhap vao ngay thang nam sinh moi: ");
        newDate = sc.nextLine();
        System.out.print("Nhap vao dia chi moi: ");
        newAddess = sc.nextLine();
        this.name = newName;
        this.date = newDate;
        this.address = newAddess;
    }


    public Employee() {
    }

    public Employee(String id, String name, String date, String address) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getAddress() {
        return address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void input(Scanner sc) {
        System.out.print("Enter name:");
        name = sc.nextLine();
        System.out.print("Enter date of birth:");
        date = sc.nextLine();
        System.out.print("Enter address:");
        address = sc.nextLine();
    }

    public void output() {
        System.out.println("===== Employee Information =====");
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Date of birth: " + date);
        System.out.println("Address: " + address);
    }
}
