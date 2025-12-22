package lession03_ke_thua.practice.EmployeesLession;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMain {
    static int countME = 0;
    static int countPE = 0;
    static Scanner sc = new Scanner(System.in);
    static ArrayList<ManagementEmployee> managementEmployees = new ArrayList<>();
    static ArrayList<ProductionEmployee> productionEmployees = new ArrayList<>();

    public static void main(String[] args) {
       /* ProductionEmployee productionEmployee = new ProductionEmployee("PRDE-01", "Vo Dang Nam", "30/10/2004", "Da Nang", 10000.5);
        productionEmployee.output();*/
      /*  ManagementEmployee managementEmployee = new ManagementEmployee();
        System.out.println();
        managementEmployee.input(sc);*/
        mainMenu();

    }

    public static void mainMenu() {
        int chose;
        while (true) {
            do {
                System.out.println("==CHUONG TRINH QUAN LI NHAN VIEN==");
                System.out.println("1. Them Moi Nhan vien");
                System.out.println("2. Cap Nhat Thong Tin");
                System.out.println("3. Xem danh sach");
                System.out.println("4. Thoat");
                System.out.print("Nhap vao lua chon cua ban: ");
                chose = Integer.parseInt(sc.nextLine());

                switch (chose) {
                    case 1:
                        addNewEmployee();
                        break;
                }

            } while (chose <= 0 || chose > 4);
        }
    }


    /// Them nhan vien
    public static void addNewEmployee() {
        int chose;
        do {
            System.out.println("==Them moi nhan vien==");
            System.out.println("1. Them Moi Nhan vien Quan Ly");
            System.out.println("2. Them Moi Nhan vien San Xuat");
            System.out.println("3. Tro ve menu chinh");
            System.out.print("Nhap vao lua chon cua ban: ");
            chose = Integer.parseInt(sc.nextLine());

            switch (chose) {
                case 1:
                    ManagementEmployee managementEmployee = new ManagementEmployee();
                    managementEmployee.input(sc);
                    managementEmployee.setId(getIdManageEmployee(managementEmployee));
                    managementEmployees.add(managementEmployee);
                    break;
                case 2:
                    ProductionEmployee productionEmployee = new ProductionEmployee();
                    productionEmployee.input(sc);
                    productionEmployee.setId(getIdProductEmployee(productionEmployee));
                    productionEmployees.add(productionEmployee);
                    break;
                case 3:
                    mainMenu();
                    break;
                default:
                    System.out.println("Lua chon khong phu hop vui long nhap lai");
            }
        } while (chose <= 0 || chose > 3);
    }
/*
    /// Cap nhat thong tin
    private static void UpdateEmployee() {
        int chose;
        while (true) {
            do {
                System.out.println("==CAP NHAT NHAN VIEN==");
                System.out.println("1. Cap Nhat Nhan vien Quan Li");
                System.out.println("2. Cap Nhat Nhan vien San Xuat");
                System.out.println("3. Xem danh sach");
                System.out.print("Nhap vao lua chon cua ban: ");
                chose = Integer.parseInt(sc.nextLine());

                switch (chose) {
                    case 1:
                        System.out.print("Nhap vao id cua nhan vien quan li do: ");
                        String idFind = sc.nextLine();
                        for (ManagementEmployee e : managementEmployees) {
                            if ()
                        }
                        break;
                }

            } while (chose <= 0 || chose > 4);
        }
    }*/

    public static String getIdManageEmployee(ManagementEmployee managementEmployee) {
        countME++;
        String id = String.format("QL%3d", countME).replace(" ", "0");

        return id;
    }

    public static String getIdProductEmployee(ProductionEmployee productionEmployee) {
        countPE++;
        String id = String.format("QL%3d", countME).replace(" ", "0");
        return id;
    }

}
