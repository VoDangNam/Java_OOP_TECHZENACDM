package lession11_file.excercice.excercice_Study.Bai01.CauE;

import java.io.File;
import java.util.Scanner;

public class Bai1E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path;
        System.out.print("Nhap vao duong dan can xoa: ");
        path = sc.nextLine();
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("Duong dan khong ton tai");
        } else {
            if (file.delete()) {
                System.out.println("Xoa file/ Thu muc thanh cong");
            } else {
                System.out.println("Xoa khong thanh cong (co the thu muc khong rong)");
            }
        }
    }
}
