package lession11_file.excercice.excercice_Study.Bai01.CauA;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bai1A {
    public static final String path = "JavaOOP/src/lession11_file/excercice/excercice_Study/data/dataFile";
    public static final Logger logger = Logger.getLogger(Bai1A.class.getName());

    public static void main(String[] args) {
        File file = new File(path);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.print(line + "\t");
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, ">>Loi khong doc duoc file", e);
        }

    }
}
