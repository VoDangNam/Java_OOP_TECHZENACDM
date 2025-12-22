package lession03_ke_thua.practice;

import java.util.Scanner;

public class Employee {
    String id;
    String name;
    String date;
    String address;

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

    public void input(Scanner sc){
        System.out.print("Enter name:");
        name = sc.nextLine();
        System.out.print("Enter date of birth:");
        date = sc.nextLine();
        System.out.print("Enter address:");
        address = sc.nextLine();
    }

    public void output(){
        System.out.println("===== Employee Information =====");
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Date of birth: " + date);
        System.out.println("Address: " + address);
    }
}
