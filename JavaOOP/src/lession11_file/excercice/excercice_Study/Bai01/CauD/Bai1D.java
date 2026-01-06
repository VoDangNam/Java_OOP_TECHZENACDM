package lession11_file.excercice.excercice_Study.Bai01.CauD;

import java.io.File;
import java.util.Scanner;

public class Bai1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path;
        System.out.print("Nhap vao duong dan can kiem tra: ");
        path = sc.nextLine();
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("Duong dan khong ton tai");
        } else if (file.isFile()) {
            System.out.println("Duong dan la file");
        } else if (file.isDirectory()) {
            System.out.println("Duong dan la folder");
        }
    }
}
