package lession11_file.excercice.excercice_Study.Bai01.CauB;

import lession11_file.excercice.excercice_Study.Bai01.CauA.Bai1A;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bai1B {
    public static final String path = "JavaOOP/src/lession11_file/excercice/excercice_Study/data/dataFile";
    public static final Logger logger = Logger.getLogger(Bai1B.class.getName());

    public static void main(String[] args) {
        File file = new File(path);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            int count = 1;
            while ((line = bufferedReader.readLine()) != null && count <= 3) {
                System.out.print(line + "\t");
                count++;
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, ">>Loi khong doc duoc file", e);
        }

    }

}
