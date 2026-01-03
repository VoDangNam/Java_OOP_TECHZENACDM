package lession10_Exception.pracrice;

import java.util.Scanner;


public class Exception {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        int age;
        while (true) {
            try {
                age = inputAgeOver18();
                System.out.println("Tuoi cua ban la: " + age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("So nhap vao phai la kieu so nguyen!!!");
            } catch (FormatIntegerException | Under18YearsOldException e) {
                System.out.println(e.getMessage());
            }
        }

    }
/*

    public static int inputAgeOver18() throws Under18YearsOldException, FormatIntegerException {
        System.out.print("Nhập vào tuổi: ");
        int age = Integer.parseInt(sc.nextLine());


        if (age < 18) {
            throw new Under18YearsOldException("Bạn chưa đủ tuổi!");
        }

        return age;
    }
*/

    public static int inputAgeOver18() throws Under18YearsOldException, FormatIntegerException {
        int age = 0;
        try {
            System.out.print("Nhập vào tuổi: ");
            age = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            throw new FormatIntegerException("Ban Nhap vao khong phai la kieu so nguyen!!!");
        }

        if (age < 18) {
            throw new Under18YearsOldException("Bạn chưa đủ tuổi!");
        }

        return age;
    }
}
