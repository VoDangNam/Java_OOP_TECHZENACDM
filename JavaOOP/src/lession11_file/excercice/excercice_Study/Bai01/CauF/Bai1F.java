package lession11_file.excercice.excercice_Study.Bai01.CauF;

import java.io.File;
import java.util.Scanner;

public class Bai1F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path;
        System.out.print("Nhap vao duong dan can doi ten: ");
        path=sc.nextLine();
        File oldFile = new File(path);

        if(!oldFile.exists()){
            System.out.println("File khong ton tai!!!");
        }

        File parent = new File(oldFile.getParent());
        String newName ;
        System.out.print("Nhap vao ten moi cho file: ");
        newName = sc.nextLine();

        File newFile = new File(parent,newName);

        if(oldFile.renameTo(newFile)){
            System.out.print("Doi ten file thanh cong");
        }else {
            System.out.println("Doi ten file that bai!!!");
        }

    }
}

