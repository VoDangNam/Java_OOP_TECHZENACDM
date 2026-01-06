package lession11_file.excercice.excercice_Study.Bai01.CauC;

import lession11_file.excercice.excercice_Study.Bai01.CauA.Bai1A;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bai1C {
    public static final String path = "JavaOOP/src/lession11_file/excercice/excercice_Study/data/dataFile";
    public static final Logger logger = Logger.getLogger(Bai1C.class.getName());

    public static void main(String[] args) {
        File file = new File(path);
        Scanner sc = new Scanner(System.in);
        String kt;
        System.out.print("Nhap vao chu can dem: ");
        kt = sc.nextLine();
        String line;
        int count = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while ((line = bufferedReader.readLine()) != null) {
                if (kt.equals(line)) {
                    count++;
                }
            }
        } catch (IOException E) {
            logger.log(Level.SEVERE, ">>>Loi khong doc duoc file!!!!");
        }
        System.out.println("Ki tu: " + kt + " co " + count + " lan xuat hien trong file.");

    }
}
