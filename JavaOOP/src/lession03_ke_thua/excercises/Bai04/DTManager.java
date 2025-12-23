package lession03_ke_thua.excercises.Bai04;

import java.util.Scanner;

public class DTManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n-- CHUONG TRINH QUAN LY DIEN THOAI --");
            System.out.println("1. Xem danh sach dien thoai");
            System.out.println("2. Them moi");
            System.out.println("3. Cap nhat");
            System.out.println("4. Xoa");
            System.out.println("5. Thoat");
            System.out.print("Chon chuc nang: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    menuXemDanhSach(sc);
                    break;
                case 2:
                    menuThemMoi(sc);
                    break;
                case 3:
                    System.out.println(">> Chuc nang Cap nhat");
                    break;
                case 4:
                    System.out.println(">> Chuc nang Xoa");
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 5);
    }

    static void menuXemDanhSach(Scanner sc) {
        int choice;
        do {
            System.out.println("\n-- XEM DANH SACH DIEN THOAI --");
            System.out.println("1. Xem tat ca");
            System.out.println("2. Xem dien thoai cu");
            System.out.println("3. Xem dien thoai moi");
            System.out.println("4. Tro ve menu chinh");
            System.out.print("Chon: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(">> Xem tat ca");
                    break;
                case 2:
                    System.out.println(">> Xem dien thoai cu");
                    break;
                case 3:
                    System.out.println(">> Xem dien thoai moi");
                    break;
            }
        } while (choice != 4);
    }

    static void menuThemMoi(Scanner sc) {
        int choice;
        do {
            System.out.println("\n-- THEM MOI DIEN THOAI --");
            System.out.println("1. Them dien thoai cu");
            System.out.println("2. Them dien thoai moi");
            System.out.println("3. Tro ve menu chinh");
            System.out.print("Chon: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(">> Them dien thoai cu");
                    break;
                case 2:
                    System.out.println(">> Them dien thoai moi");
                    break;
            }
        } while (choice != 3);
    }

}
