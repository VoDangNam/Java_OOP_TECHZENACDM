package lession03_ke_thua.practice.EmployeesLession;

import java.util.Scanner;

public class ManagementEmployee extends Employee {
    private double basicSalary;
    private double coefficientSalary;

    @Override
    public void input(Scanner sc) {
        super.input(sc);
        System.out.println("Nhap vao Luong co ban: ");
        this.basicSalary = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap vao he so Luong: ");
        this.coefficientSalary = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Luong co ban: " + this.basicSalary);
        System.out.println("He So Luong: " + this.coefficientSalary);
    }

    @Override
    public void updateEmployee(Scanner sc) {
        super.updateEmployee(sc);
        double newLuongCB;
        double newHeSoLuong;
        System.out.print("Nhap luong co ban moi: ");
        newLuongCB = Double.parseDouble(sc.nextLine());
        this.basicSalary = newLuongCB;
        System.out.print("Nhap vao he so luong: ");
        newHeSoLuong = Double.parseDouble(sc.nextLine());
        this.coefficientSalary = newHeSoLuong;
    }

    public ManagementEmployee() {
    }

    public ManagementEmployee(double coefficientSalary, double basicSalary) {
        this.coefficientSalary = coefficientSalary;
        this.basicSalary = basicSalary;
    }

    public ManagementEmployee(String id, String name, String date, String address, double coefficientSalary, double basicSalary) {
        super(id, name, date, address);
        this.coefficientSalary = coefficientSalary;
        this.basicSalary = basicSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getCoefficientSalary() {
        return coefficientSalary;
    }

    public void setCoefficientSalary(double coefficientSalary) {
        this.coefficientSalary = coefficientSalary;
    }
}
