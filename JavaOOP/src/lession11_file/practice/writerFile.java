package lession11_file.practice;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class writerFile {
    private static final Logger logger = Logger.getLogger(writerFile.class.getName());

    public static void main(String[] args) {
        File file = new File("JavaOOP/src/lession11_file/data/input");
        /// Try with resoucre

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true))) {
            try {
                /// Ghi de toan bo du lieu trong file
                bufferedWriter.write("Tran Van D\n");
                bufferedWriter.write("Tran Van E\n");
                bufferedWriter.write("Tran Van F\n");
                bufferedWriter.write("Tran Van G\n");
                bufferedWriter.write("Tran Van H\n");

                System.out.println("da ghi thanh cong");
            } catch (IOException e) {
                logger.log(Level.SEVERE, ">>Loi khi ghi file", e);
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, ">>>Loi kho dongs file", e);
        }


    }
}
